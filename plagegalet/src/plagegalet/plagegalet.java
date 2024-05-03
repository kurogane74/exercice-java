package plagegalet;

import java.util.Scanner;

public class plagegalet {

	public static void main(String[] args) {

		Scanner sc;
		sc = new Scanner(System.in);
		int chiffre;

		System.out.println("Entrez un chiffre");
		chiffre = sc.nextInt();
		while (chiffre < 10 || chiffre > 20) {
			if (chiffre < 10) {
				System.out.println("plus grand");
			}
			else if (chiffre > 20) {
				System.out.println("plus petit");
			}
			System.out.println("entrez un chiffre");
			chiffre = sc.nextInt();
		}

		sc.close();
	}

}
