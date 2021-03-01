package models;

import java.util.ArrayList;

public class Menu {

	
	ArrayList<Plat> plat;
	
	// ajout du constructeur 
	public Menu(Plat plat) 
	{
	
		this.plat = new ArrayList<>();
	}
	

	// ArrayList plat 
	
			public ArrayList<Plat>getListePlat(){
				return this.plat; 
			}

	//@Override
	//public String toString() {
	//	return "Menu [plat=" + plat + "]";
	//}
}

