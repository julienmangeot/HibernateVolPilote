package dao;

import java.util.List;

import beans.Vol;

public interface IVolDao {
	
	public boolean createVol(Vol vol);
	
	public List<Vol> getVols();

}
