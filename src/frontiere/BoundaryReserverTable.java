package frontiere;
import java.util.Scanner;
import control.*;

public class BoundaryReserverTable {
	Scanner scan = new Scanner(System.in);
	ControlReserverTable control = new ControlReserverTable();
	public void reserverTable(int numClient) {
		System.out.println("Quand souhaitez-vous réserver?\n");
		System.out.println("Pour quel mois?\n");
		int mois = scan.nextInt();
		System.out.println("Pour quel jour?\n");
		int jour = scan.nextInt();
		System.out.println("Pour combien de personnes?\n");
		int nombrePersonnes = scan.nextInt();
		System.out.println("Pour quel service?\n");
		int numService = scan.nextInt();
		int[] possibilités = control.trouverPossibilite(jour, mois, nombrePersonnes, numService);
	}
}