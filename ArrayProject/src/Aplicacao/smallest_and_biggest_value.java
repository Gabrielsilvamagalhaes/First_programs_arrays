package Aplicacao;

import java.util.Scanner;

public class smallest_and_biggest_value {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		do {
			System.out.println("Enter lenght of the array: ");
			int tam = sc.nextInt();

			int x[] = new int[tam];
			int small = 0, big = 0;

			System.out.println("Enter the 1° number: ");
			x[0] = sc.nextInt();
			small = x[0];
			big = x[0];

			for (int i = 1; i < x.length; i++) {
				System.out.println("Enter the " + (i + 1) + "numbers:");
				x[i] = sc.nextInt();

				if (x[i] > big) {
					big = x[i];
				}
				if (x[i] < small) {
					small = x[i];
				}

			}
			System.out.println("The biggest number is: " + big);
			System.out.println("The smallest number is: " + small);

			System.out.println("\nAgain? (1)yes or (2)not");
			cont = sc.nextInt();
			switch (cont) {
			case 2:
				System.out.println("Finish the program!");
				break;
			}

		} while (cont == 1);
		sc.close();
	}
}
