package model;

public class ReservationSpectacle extends Reservation{
	int numZone;
	int numChaise;
	public ReservationSpectacle(int jour, int mois, int numZone, int numChaise) {
		super(jour, mois);
		this.numZone = numZone;
		this.numChaise = numChaise;
	}
	public String toString() {
		String chaine = "Le "+ jour + "/" + mois + " :  chaise n°" + numChaise + " à la zone n°" + numZone + ".";
		return chaine;
	}
}
