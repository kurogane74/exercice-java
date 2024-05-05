package caisse;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caisse {


	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		float prix = 1;
		float total = 0;
		int billet;
		
		while (prix != 0) {
			System.out.println("entré un prix :");
			prix = sc.nextFloat();
			total = total + prix;
			
		}
		
		if (total % 5 != 0) {
			billet = (int) ((total / 5) + 1);
		}
		else {
			billet = (int) (total / 5);
		}
		System.out.println("Le client doit payer " +df.format(total));
		System.out.println("Le client doit donner " +billet+ " de 5€ soit " +billet *5+ "€");
		float rendumonnaie = billet * 5 - total;
		System.out.println("rendu monnaie : " +df.format(rendumonnaie)+ "€");
		int piece2 = (int) (rendumonnaie / 2);
		int piece20cts = (int) ((rendumonnaie - (piece2 * 2)) /0.20);
		int piece10cts = (int) ((rendumonnaie - ((piece2 * 2) + (piece20cts * 0.2))) / 0.10);
		System.out.println("Répartition de la monnaie à restituer au client :");
		System.out.println(piece2+ " pieces de 2€");
		System.out.println(piece20cts+ " pieces de 0.20cts");
		System.out.println(piece10cts+ " pieces de 0.10cts");
		sc.close();
	}

}
