package somme;

import java.util.Scanner;

public class somme {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		int nombre = 0;
		System.out.println("entrer un nombre");
		nombre = sc.nextInt();
		int somme = 0;

		for (int i = 0; i <= nombre; i++) {
			somme += i;
		}

		System.out.println("la somme des nombres jusque " +nombre+ " est " +somme);
		
		sc.close();
	}

}
