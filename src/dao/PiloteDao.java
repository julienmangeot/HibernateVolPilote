package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Pilote;

public class PiloteDao implements IPiloteDao{
	SessionFactory factory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
	
	public boolean createPilote(Pilote pilote) {
		try {
			Session s = factory.openSession();
			s.beginTransaction();
			s.saveOrUpdate(pilote);
			s.getTransaction().commit();
			s.close();
			System.out.println("Pilote creation succeded");
			return true;
		}
		catch(HibernateException e){
			e.printStackTrace();
			System.out.println("Pilote creation failed");
			return false;
		}
	}

	public List<Pilote> getPilotes() {
		List<Pilote> list = new ArrayList<Pilote>();
		try {
			Session s = factory.openSession();
			s.beginTransaction();
			Query query = s.createQuery("from Pilote");
			list=query.list();
			s.close();
			System.out.println("Pilotes display succeded");
			return list;
		}
		catch(HibernateException e){
			e.printStackTrace();
			System.out.println("Pilotes display failed");
			return null;
		}
	}

}
