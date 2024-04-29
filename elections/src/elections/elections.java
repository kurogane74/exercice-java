package elections;

import java.util.Scanner;

public class elections {

	public static void main(String[] args) {
		
		String resultat = null;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("pourcentage du candidat 1");
		int candidat1 = sc.nextInt();
		System.out.print("pourcentage du candidat 2");
		int candidat2 = sc.nextInt();
		System.out.print("pourcentage du candidat 3");
		int candidat3 = sc.nextInt();
		System.out.print("pourcentage du candidat 4");
		int candidat4 = sc.nextInt();
		
		if ((candidat1 + candidat2 + candidat3 + candidat4) <= 100) {
			
		
		
			if (candidat1 > 50) {
				resultat = "Vous étes elu!";
			}
			else if (candidat1 < 12.5) {
				resultat = "Vous avez perdu!";
			}
			else if ((candidat1 > candidat2) && (candidat1 > candidat3) && (candidat1 > candidat4)) {
				resultat = "Vous étes au deuxieme tour avec avantage";
			}
			else if ((candidat1 < candidat2) || (candidat1 < candidat3) || (candidat1 < candidat4)) {
				resultat = "Vous étes au deuxieme tour";
			}
			
		}
		
		else {
			resultat = "y a un soucie";
		}
		
		System.out.print(resultat);

	}

}
