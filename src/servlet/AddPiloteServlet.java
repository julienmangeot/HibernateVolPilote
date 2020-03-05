package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Pilote;
import dao.IPiloteDao;
import dao.PiloteDao;


/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addp")
public class AddPiloteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPiloteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.getServletContext().getRequestDispatcher("/WEB-INF/webpages/addingpilote.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IPiloteDao daoP= new PiloteDao();
		Pilote pilote = new Pilote();
		
		pilote.setNomPilote(request.getParameter("nom"));
		pilote.setPrenomPilote(request.getParameter("prenom"));
		pilote.setTelephone(request.getParameter("phone"));
		
		daoP.createPilote(pilote);
		this.getServletContext().getRequestDispatcher("/WEB-INF/webpages/showingpilote.jsp").forward(request, response);
	}

}
