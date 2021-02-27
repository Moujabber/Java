package view;

public class Restaurant {

	
	private String nom_restaurant;
	private String adresse_restaurant;
	private int numero_tel;
	private int numero_siret;
	
	
	// ajout du constructeur 
	public Restaurant(String nom_restaurant, String adresse_restaurant,int numero_tel,int numero_siret) 
	{
		
		this.setNom_restaurant(nom_restaurant);
		this.setAdresse_restaurant(adresse_restaurant);
		this.setNumero_tel(numero_tel) ;
		this.setNumero_tel(numero_siret) ;
	}

	//get et set nom_restaurant
	public String getNom_restaurant() {
		return nom_restaurant;
	}

	
	public void setNom_restaurant(String nom_restaurant) {
		this.nom_restaurant = nom_restaurant;
	}

	//get et set adresse_restaurant
	public String getAdresse_restaurant() {
		return adresse_restaurant;
	}


	public void setAdresse_restaurant(String adresse_restaurant) {
		this.adresse_restaurant = adresse_restaurant;
	}

	//get et set numero_tel
	public int getNumero_tel() {
		return numero_tel;
	}


	public void setNumero_tel(int numero_tel) {
		this.numero_tel = numero_tel;
	}

	//get et set numero_siret
	public int getNumero_siret() {
		return numero_siret;
	}


	public void setNumero_siret(int numero_siret) {
		this.numero_siret = numero_siret;
	}

	//@Override
	//public String toString() {
	//	return "Restaurant [nom_restaurant=" + nom_restaurant + ", adresse_restaurant=" + adresse_restaurant
	//			+ ", numero_tel=" + numero_tel + ", numero_siret=" + numero_siret + "]";
	//}
	
	
	
	
	
	
	
	
	
	
	
}
