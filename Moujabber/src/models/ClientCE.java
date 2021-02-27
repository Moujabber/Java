package models;

public class ClientCE extends Client {
	private int montant_réduction; 
	
		// Ajout constructeur
		public ClientCE(String nom, String prenom, int nb_de_pers) 
		{
					super(nom,prenom, nb_de_pers);
					
					
		}
		// get et set monant_reduction
		public int getMontant_réduction() {
			return montant_réduction;
		}

		public void setMontant_réduction(int montant_réduction) {
			this.montant_réduction = montant_réduction;
		}
		//@Override
		//public String toString() {
		//	return "ClientCE [montant_réduction=" + montant_réduction + "]";
		//}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
