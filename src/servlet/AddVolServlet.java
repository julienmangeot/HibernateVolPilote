package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Pilote;
import beans.Vol;
import dao.IPiloteDao;
import dao.IVolDao;
import dao.PiloteDao;
import dao.VolDao;

/**
 * Servlet implementation class AddVolServlet
 */
@WebServlet("/addv")
public class AddVolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<Pilote> list = new ArrayList<Pilote>();
	IPiloteDao daoP = new PiloteDao();
	
	list=daoP.getPilotes();
	request.setAttribute("listing", list);
	this.getServletContext().getRequestDispatcher("/WEB-INF/webpages/addingvol.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IVolDao daoV= new VolDao();
		Vol vol = new Vol();
		Pilote pilote = new Pilote();
		pilote.setIdPilote(Integer.parseInt(request.getParameter("pilotefly")));
		System.out.println("on veut le vol");
		try {
			System.out.println("try");
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
			vol.setDateVol(date);
			System.out.println("coucou"+date);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("echec try");
		}
	
		vol.setPilote(pilote);
		daoV.createVol(vol);
		
		
		this.getServletContext().getRequestDispatcher("/showv").forward(request, response);
	
	}

}
