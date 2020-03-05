package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Vol;

public class VolDao implements IVolDao{
	SessionFactory factory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
	
	public boolean createVol(Vol vol) {
		try {
			Session s = factory.openSession();
			s.beginTransaction();
			s.saveOrUpdate(vol);
			s.getTransaction().commit();
			s.close();
			System.out.println("Vol creation succeded");
			return true;
		}
		catch(HibernateException e){
			e.printStackTrace();
			System.out.println("Vol creation failed");
			return false;
		}
	}

	public List<Vol> getVols(){
		List<Vol> list =new ArrayList<Vol>();
		try {
			Session s = factory.openSession();
			s.beginTransaction();
			Query query = s.createQuery("from Vol");
			list=query.list();
			s.close();
			System.out.println("Vols display succeded");
			return list;
		}
		catch(HibernateException e){
			e.printStackTrace();
			System.out.println("Vols display failed");
			return null;
		}
	}

}
