package models;

public class Client {

	private String nom;
	private String date_réservation;
	protected int nb_de_pers;
	
	// ajout du constructeur 
	public Client(String nom, String date_réservation,int nb_de_pers) 
	{
		
		this.setNom(nom);
		this.setDate_réservation(date_réservation);
		this.setNb_de_pers(nb_de_pers) ;
	}
	//get et set nom
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	//get et set date_réservation
	public String getDate_réservation() {
		return date_réservation;
	}

	public void setDate_réservation(String date_réservation) {
		this.date_réservation = date_réservation;
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
//		return "Client [nom=" + nom + ", date_réservation=" + date_réservation + ", nb_de_pers=" + nb_de_pers + "]";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
