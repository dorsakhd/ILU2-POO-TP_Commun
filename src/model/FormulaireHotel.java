package model;

public class FormulaireHotel extends Formulaire {
	int nbLitsSimples;
	int nbLitsDoubles;
	public FormulaireHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles) {
		super(jour, mois);
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
	}
	public int getLitsSimples() {
		return nbLitsSimples;
	}
	public int getLitsDoubles() {
		return nbLitsDoubles;
	}
}