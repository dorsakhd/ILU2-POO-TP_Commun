package model;

public class ReservationHotel extends Reservation{
	int nbLitsSimples;
	int nbLitsDoubles;
	int numChambre;
	public ReservationHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles, int numChambre) {
		super(jour, mois);
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
		this.numChambre = numChambre;
	}
	public String toString() {
		String chaine = "Le "+jour+"/"+mois + " : " + nbLitsSimples + " lits simples et " + nbLitsDoubles + " lits doubles pour la chambre n°"+numChambre + ".";
		return chaine;
	}
}