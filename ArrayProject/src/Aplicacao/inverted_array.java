package Aplicacao;
import java.util.*;
public class inverted_array {
	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Tell me the lenght of the arrays ");
			int tam1 = sc.nextInt();
			int tam2 = sc.nextInt();
		
			int [] x = new int [tam1];
			int [] y = new int [tam2];
			int promt =0;
			
			int i;
			for( i = 0 ; i<x.length ;i++) {
				System.out.println("Enter the " +(i+1)+ "° number of the first array: ");
				x[i] = sc.nextInt();
				System.out.println("Enter the " +(i+1)+ "° number of the second array: ");
				y[i]= sc.nextInt();
				
					promt = x[i];
					x[i] = y[i];
					y[i] = promt;
			}
	
	

		      
		      System.out.println("The inverted first array: "+ Arrays.toString(x));

		     

		      System.out.println("The inverted secon array: "+ Arrays.toString(y));
	
	}
	

}
