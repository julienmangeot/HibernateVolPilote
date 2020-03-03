package dao;

import java.util.List;

import beans.Pilote;

public interface IPiloteDao {
	
	public boolean createPilote(Pilote pilote);
	
	public List<Pilote> getPilotes();

}
