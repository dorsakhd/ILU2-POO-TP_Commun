package control;
import model.*;

public class ControlReserverTable {
	private Restaurant restaurant = new Restaurant();
	private Formulaire[] formulaires = new Formulaire[100];
	public int[] trouverPossibilite(int jour, int mois, int nombrePersonnes, int numService) {
		FormulaireRestaurant formulaire = new FormulaireRestaurant(jour, mois, nombrePersonnes, numService);
		boolean formulaireEnregistrer = false;
		int numeroFormulaire = -1;
		for (int i = 0; i < formulaires.length && !formulaireEnregistrer; i++) {
				if (formulaires[i] == null) {
				formulaires[i] = formulaire;
				formulaireEnregistrer = true;
				numeroFormulaire = i;
				}
				}
				int[] possibilites = restaurant.donnerPossibilites(formulaire);
				int[] retour = new int[possibilites.length + 1];
				retour[0] = numeroFormulaire;
				for (int i = 1; i < possibilites.length + 1; i++) {
				retour[i] = possibilites[i - 1];
				}
				return retour;
	}
}
