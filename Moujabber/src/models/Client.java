package models;

import java.util.ArrayList;

public abstract class Client {

	private String nom;
	private String date_réservation;
	protected int nb_de_pers;
	private static int numStatic = 1;
	protected int numtable = 1;
	ArrayList<Plat> plat;
	ArrayList<Menu> menu;
	
	
	
	// ajout du constructeur 
	public Client(String nom, String date_réservation,int nb_de_pers) 
	{
		
		this.nom =nom;
		this.date_réservation=date_réservation;
		this.nb_de_pers=nb_de_pers ;
		this.numtable= Client.numStatic ++ ;
		this.plat = new ArrayList<>();
		this.menu = new ArrayList<>();
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


	// ArrayList plat 
	
	public ArrayList<Plat>getListePlat(){
		return this.plat; 
	}
	
	
	// ArrayList menu 
	
		public ArrayList<Menu>getListeMenu(){
			return this.menu; 
		}
	
	// Calcule de l'adition 
	public float adition() {
		float somme=0.0f;
		for(Plat value : plat) {
			somme = somme + value.getPrix();
			System.out.println(value);
		
		}
		for(Menu value : menu) {
			for (Plat value1 :value.getListePlat()) {
				somme = somme + value1.getPrix();
				System.out.println(value1);
			}
		
		}
		return somme;
	 }
	
	// liste ajouter un plat
	
		public void addPlat(Plat plat) {
			
			this.plat.add(plat);
		}
		
		// liste ajouter un menu
		
			public void addMenu(Menu menu) {
				
				this.menu.add(menu);
			}

	@Override
	public String toString() {
		return "Client [menu=" + menu + "]";
	}
    
		    
		    
		    
	
		

	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
}
