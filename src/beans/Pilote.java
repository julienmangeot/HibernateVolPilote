package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pilote {

	@Id
	@GeneratedValue
	private int idPilote;
	private String nomPilote;
	private String prenomPilote;
	private String telephone;
	
	public Pilote() {
	}

	public Pilote(String nomPilote, String prenomPilote, String telephone) {
		this.nomPilote = nomPilote;
		this.prenomPilote = prenomPilote;
		this.telephone = telephone;
	}

	public int getIdPilote() {
		return idPilote;
	}

	public void setIdPilote(int idPilote) {
		this.idPilote = idPilote;
	}

	public String getNomPilote() {
		return nomPilote;
	}

	public void setNomPilote(String nomPilote) {
		this.nomPilote = nomPilote;
	}

	public String getPrenomPilote() {
		return prenomPilote;
	}

	public void setPrenomPilote(String prenomPilote) {
		this.prenomPilote = prenomPilote;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String toString() {
		return "id :"+ idPilote + ", Nom :" + nomPilote + ", Prenom :" + prenomPilote
				+ ", Telephone :" + telephone;
	}
	
}
