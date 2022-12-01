package array;

import java.util.Scanner;

public class Array2022 {
	
	public static void main(String[] args) {
		int salario[] = new int[12];
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0;i<salario.length;i++) {
			System.out.println("Dame el salario de mes " + (i+1) );
			 salario[i]=teclado.nextInt();
			 
		}
		
		System.out.println("Salario 2022");
		for(int i = 0;i<salario.length;i++) {
			System.out.println("Mes "+ (i+1) +": " + salario[i]);
		}
	}
}
