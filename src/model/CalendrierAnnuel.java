package model;

public class CalendrierAnnuel {
	private class Mois{
		private String nom;
		private boolean[] jours;
		public Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
			for(int i = 0 ; i<nbJours ; i++) {
				jours[i] = false;
			}
		}
		public boolean estLibre(int jour) {
			if(jour<=jours.length) {
			return (!jours[jour-1]);
			}
			else {
				return false;
			}
		}
		public void reserver(int jour) {
			if(estLibre(jour)) {
				jours[jour-1] = true;
			}
			else {
				throw new IllegalStateException("Le jour est déjà réservé");
			}
		}
	}
	private Mois[] calendrier;
	public CalendrierAnnuel() {
		calendrier = new Mois[12];
		Mois janvier = new Mois("Janvier", 31);
		calendrier[0] = janvier;
		Mois fevrier = new Mois("Février", 28);
		calendrier[1] = fevrier;
		Mois mars = new Mois("Mars", 31);
		calendrier[2] = mars;
		Mois avril = new Mois("Avril", 30);
		calendrier[3] = avril;
		Mois mai = new Mois("Mai", 31);
		calendrier[4] = mai;
		Mois juin = new Mois("Juin", 30);
		calendrier[5] = juin;
		Mois juillet = new Mois("Juillet", 31);
		calendrier[6] = juillet;
		Mois aout = new Mois("Août", 31);
		calendrier[7] = aout;
		Mois septembre = new Mois("Septembre", 30);
		calendrier[8] = septembre;
		Mois octobre = new Mois("Octobre", 31);
		calendrier[9] = octobre;
		Mois novembre = new Mois("Novembre", 30);
		calendrier[10] = novembre;
		Mois decembre = new Mois("Décembre", 31);
		calendrier[11] = decembre;
	}
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	public boolean reserver(int jour, int mois) {
		if(estLibre(jour, mois)) {
			calendrier[mois-1].reserver(jour);
			return true;
		}
		else {
			return false;
		}
	}
}