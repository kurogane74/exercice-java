package alimentertableau;

import java.util.Scanner;

public class alimentertableau {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("combien d'entrée dans le tableau");
		int valeur = sc.nextInt();
		int [] tableau = new int[valeur];
		int p = 0, n = 0;
		
		for (int i = 0; i < valeur; i++) {
			System.out.println("Valeur a entrer :");
			tableau[i] = sc.nextInt();
			if (tableau[i] < 0) {
				n++;
			}
			else {
				p++;
			}
		}
			
				System.out.println("nombre de valeur negative : " +n);
				System.out.println("nombre de valeur positive : " +p);
				

				sc.close();
	}

}
