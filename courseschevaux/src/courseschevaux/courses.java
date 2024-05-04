package courseschevaux;

import java.util.Scanner;

public class courses {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Nombre de chevaux partants:");
		int n = sc.nextInt();
		System.out.println("Nombre de chevaux joué");
		int p = sc.nextInt();
		int factorieln = 1;
		int factorielp = 1;
		int factorielnp = 1;
		int np = n - p;
		
		for (int i1 = 1; i1 <= n; i1++) {
			factorieln *= i1;
		}
		for (int y = 1; y <= p; y++) {
			factorielp *= y;
		}
		for (int z = 1; z <= np; z++) {
			factorielnp *= z;
		}
		System.out.println("Dans l'ordre : 1 chance sur " +factorieln / factorielnp+ " de gagner.");
		System.out.println("Dans le desordre : 1 chance sur " +factorieln / (factorielp * factorielnp)+ " de gagner");

		sc.close();
	}

}
