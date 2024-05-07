package nombresuivantfor;

import java.util.Scanner;

public class nombresuivantfor {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		int nombre;
		System.out.println("entrez un nombre");
		nombre = sc.nextInt();
		System.out.print("Les nombres aprés " +nombre+ " sont : ");
		nombre++;

		for (int i = 0; i < 10; i++, nombre++) {
			System.out.print(nombre+ ", ");
		}

		sc.close();
	}

}
