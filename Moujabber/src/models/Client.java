package models;

public class Client {

	private String nom;
	private String date_r�servation;
	protected int nb_de_pers;
	
	// ajout du constructeur 
	public Client(String nom, String date_r�servation,int nb_de_pers) 
	{
		
		this.setNom(nom);
		this.setDate_r�servation(date_r�servation);
		this.setNb_de_pers(nb_de_pers) ;
	}
	//get et set nom
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	//get et set date_r�servation
	public String getDate_r�servation() {
		return date_r�servation;
	}

	public void setDate_r�servation(String date_r�servation) {
		this.date_r�servation = date_r�servation;
	}
	//get et set nb_de_pers
	public int getNb_de_pers() {
		return nb_de_pers;
	}

	public void setNb_de_pers(int nb_de_pers) {
		this.nb_de_pers = nb_de_pers;
	}
	
	
//	@Override
//	public String toString() {
//		return "Client [nom=" + nom + ", date_r�servation=" + date_r�servation + ", nb_de_pers=" + nb_de_pers + "]";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
