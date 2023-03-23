package Aplicacao;

import java.util.Arrays;
import java.util.Scanner;

public class Odenacao_De_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		do {
		
		System.out.println("Enter lenght of the array");
		int tam= sc.nextInt();
		int [] x = new int[tam];
		int [] y = new int[x.length];
		
		for(int i = 0; i<x.length; i++) {
		System.out.println("Enter the " + (i+1) + "° number: ");
		x[i] = sc.nextInt();
		}
		
		for(int i = 0; i<x.length-1; i++) {
			for(int j = (i+1); j<x.length; j++) {
				if(x[i]>x[j]) {
				int	promt = x[i];
					x[i] = x[j];
					x[j] = promt;
				}
				
			}
		}
		System.arraycopy(x, 0, y, 0, tam);
		
			
			for(int i = 0; i<y.length-1; i++) {
				for(int j = (i+1); j<y.length; j++) {
					if(y[i]<y[j]) {
					int	promt = y[i];
						y[i] = y[j];
						y[j] = promt;
					}
					
				}
			}
		
		
		
		System.out.println("\nCrescent ord: "+Arrays.toString(x));
		System.out.println("\nDecrescent ord: "+Arrays.toString(y));
		System.out.print("\nRepeat the program? (1)YEAH (2)NOT");
		cont = sc.nextInt();
		
		switch(cont) {
			case 2:
				System.out.println("Finish the program");
		}
		}while(cont == 1);
		sc.close();
	}
}
