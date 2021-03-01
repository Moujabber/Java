package models;



public class Plat {

	private PlatEnum type;
	private String nom_plat;
	private float prix;
	
	// ajout du constructeur 
	public Plat(PlatEnum type, String nom_plat,float prix) 
	{
		
		this.type =type;
		this.nom_plat=nom_plat;
		this.prix=prix ;
		
	}
	public enum PlatEnum {
		
		ENTREE,
		PLAT,
		DESERT,
		BOISSON;

	}
	//get et set nom_plat
	public String getNom_plat() {
		return nom_plat;
	}

	public void setNom_plat(String nom_plat) {
		this.nom_plat = nom_plat;
	}
	
	
	// get et set type
	public PlatEnum getType() {
		return type;
	}

	public void setType(PlatEnum type) {
		this.type = type;
	}

	
	
	
	
		
	// calcul de la promotion
	//public static void main(String args[]){
	//	int prix;
	// System.out.println("");
	//signe=Saisie.lire_int();
	// if(signe==1)System.out.println("L'addition est de :",prix,"euros");
	//
	//}
		
	
	// get et set prix
		

		public float getPrix() {
			return prix;
		}
		public void setPrix(float prix) {
			this.prix = prix;
		}
		// Afficher les plats
		@Override
		public String toString() {
			return "Plat [nom_plat=" + nom_plat + "]";
		}

	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
