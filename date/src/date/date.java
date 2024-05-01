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

		/*mois a 31 jours : janvier1 mars3 mai5 juillet7 aout8 octobre10 decembre12 */

			if (jour > 31 || mois > 12) {
				System.out.println("Date invalide");
			}
			switch(mois) {
				case 4, 6, 9, 11:
				if (jour > 30) {
					System.out.println("Date invalide");
				}
				break;
			}

			System.out.println("Nous somme le " +jour+ "/" +mois+ "/" +annee);

	}

}
