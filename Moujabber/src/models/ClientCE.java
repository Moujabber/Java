package models;

public class ClientCE extends Client {
	private int montant_r�duction; 
	
		// Ajout constructeur
		public ClientCE(String nom, String prenom, int nb_de_pers) 
		{
					super(nom,prenom, nb_de_pers);
					
					
		}
		// get et set monant_reduction
		public int getMontant_r�duction() {
			return montant_r�duction;
		}

		public void setMontant_r�duction(int montant_r�duction) {
			this.montant_r�duction = montant_r�duction;
		}
		//@Override
		//public String toString() {
		//	return "ClientCE [montant_r�duction=" + montant_r�duction + "]";
		//}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
