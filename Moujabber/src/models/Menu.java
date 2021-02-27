package models;

public class Menu {

	
	private Plat plat;
	
	// ajout du constructeur 
	public Menu(Plat plat) 
	{
		//super(nom,prenom);
		this.plat=plat;
	}

	
	
	
	
	//get et set plat

	public Plat getPlat() {
		return plat;
	}

	public void setPlat(Plat plat) {
		this.plat = plat;
	}





	//@Override
	//public String toString() {
	//	return "Menu [plat=" + plat + "]";
	//}
}

