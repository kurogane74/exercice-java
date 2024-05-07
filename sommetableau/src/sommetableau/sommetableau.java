package sommetableau;

import java.util.Scanner;

public class sommetableau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			float[] tableau = new float[10];
			float somme = 0;
			for (int i =0; i < 10; i++) {
				System.out.println("Valeur a entrer :");
				tableau[i] = sc.nextInt();
				somme += tableau[i];
			}
			System.out.println("Somme total du tableau :" +somme);
			sc.close();

	}

}
