package factures;

import java.util.Scanner;

public class factures {

	public static void main(String[] args) {
		int reprographie;
        double facture = 0;
		Scanner sc;
		
		sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de reprographie");
        reprographie = sc.nextInt();

        if (reprographie <= 10) {
            facture = reprographie * 0.10;
        }
		if (reprographie >10 && reprographie <= 30) {
            facture =(10 * 0.10) + ((reprographie - 10) * 0.09);
        }
        if (reprographie > 30) {
            facture =(10 * 0.10) + (20 * 0.09) + ((reprographie - 30) * 0.08);
        }

        System.out.println("votre facture est de " + facture + "€");

		sc.close();

	}

}
