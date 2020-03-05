package beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vol {
	
	@Id
	@GeneratedValue
	private int idVol;
	private Date dateVol;
	@JoinColumn(name="idPilote")
	@ManyToOne
	private Pilote pilote;
	
	public Vol() {
	}

	public Vol(Date dateVol) {
		this.dateVol = dateVol;
	}

	public Vol(Date dateVol, Pilote pilote) {
		this.dateVol = dateVol;
		this.pilote = pilote;
	}

	public int getIdVol() {
		return idVol;
	}

	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}

	public Date getDateVol() {
		return dateVol;
	}

	public void setDateVol(Date dateVol) {
		this.dateVol = dateVol;
	}

	public Pilote getPilote() {
		return pilote;
	}

	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}

	public String toString() {
		return "Vol [idVol=" + idVol + ", dateVol=" + dateVol + ", pilote=" + pilote + "]";
	}
	
}
