package factorielle;

import java.util.Scanner;

public class factorielle {



		public static void main(String[] args) {
			Scanner sc;
			sc = new Scanner(System.in);
			int nombre = 0;
			System.out.println("entrer un nombre");
			nombre = sc.nextInt();
			int factorielle = 1;

			for (int i1 = 1; i1 <= nombre; i1++) {
				factorielle *= i1;
			}
			System.out.println("la factorielle de " +nombre+ " est " +factorielle);
			
			sc.close();
		}

	}