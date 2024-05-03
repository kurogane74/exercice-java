package nombresuivantfor;

import java.util.Scanner;

public class nombresuivantwhile {

	public static void main(String[] args) {

		Scanner sc;
		sc = new Scanner(System.in);
		int nombre;
		System.out.println("entrez un nombre");
		nombre = sc.nextInt();
		System.out.println("Les nombres aprés " +nombre+ " sont :");
		
		int i = 0;
		while (i < 10) {
			i++;
			nombre++;
			System.out.println(nombre);
		}

	}

}
