package models;

public class Plat {

	private String type;
	private String nom_plat;
	private int prix;
	
	// ajout du constructeur 
	public Plat(String type, String nom_plat,int prix) 
	{
		
		this.setType(type);
		this.setNom_plat(nom_plat);
		this.setPrix(prix) ;
	}
	//get et set type
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	//get et set nom_plat
	public String getNom_plat() {
		return nom_plat;
	}

	public void setNom_plat(String nom_plat) {
		this.nom_plat = nom_plat;
	}
	//get et set prix
	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
