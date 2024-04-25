package model;

public class FormulaireSpectacle extends Formulaire {
	int numZone;
	public FormulaireSpectacle(int jour, int mois, int numZone) {
		super(jour, mois);
		this.numZone = numZone;
	}
	public int getNumZone() {
		return numZone;
	}
}
