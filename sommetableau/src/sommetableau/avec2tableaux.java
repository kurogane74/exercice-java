package sommetableau;

public class avec2tableaux {

	public static void main(String[] args) {
		int[] tableau1 = new int[] {4, 8, 7, 9, 1};
		int[] tableau2 = new int[] {7, 6, 5, 2 ,1};
		int[] tableausomme = new int[5];
		
		for (int i = 0; i < 5; i++) {
			tableausomme[i] = tableau1[i] + tableau2[i];
			System.out.println(tableausomme[i]);
		}
		
	}

}
