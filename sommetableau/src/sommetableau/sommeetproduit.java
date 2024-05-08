package sommetableau;

public class sommeetproduit {

	public static void main(String[] args) {
		int[] tableau1 = new int[] {4, 8, 7, 9, 1};
		int[] tableau2 = new int[] {7, 6};
		int somme = 0;
		int produit;
		
		for (int i = 0;i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				produit = tableau1[i] * tableau2[j];
				somme += produit;
			}
		}
		System.out.println(somme);

	}

}
