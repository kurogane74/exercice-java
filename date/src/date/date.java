package date;

import java.util.Scanner;

public class date {

	public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Quel  numero de jours somme nous? ");
		int jour = sc.nextInt();
		System.out.println("Quel numero de mois somme nous? ");
		int mois = sc.nextInt();
		System.out.println("Quelle année somme nous? ");
		int annee = sc.nextInt();
		String affichage_date = null;
		int modulo = 0;
		
		modulo = annee % 4;

		/*mois a 31 jours : janvier1 mars3 mai5 juillet7 aout8 octobre10 decembre12 */

			if (jour < 1 || jour > 31 || mois < 1 || mois > 12) {
				affichage_date = "Date invalide";
			}
			else if (jour > 30) {
			switch(mois) {
				case 4, 6, 9, 11:
				
					affichage_date = "Date invalide";
				
				break;
			}
			}
			else if (mois == 2 && ((modulo == 0 && jour > 29) || (modulo != 0 && jour > 28))) {
				affichage_date = "Date invalide";
			}
			else {

			affichage_date = "Nous somme le " +jour+ "/" +mois+ "/" +annee;
			}
			System.out.println(affichage_date);

			sc.close();

	}

}
