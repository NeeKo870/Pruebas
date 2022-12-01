package array;

import java.util.Scanner;

public class PruebasArray2 {
	public static void main(String[] args) {
		int array1[];
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame longitud ");
		int longi=teclado.nextInt();
		array1 = new int[longi];
		
		for(int i = 0;i<array1.length;i++) {
			System.out.println("Dame valores " + (i+1) );
			array1[i]=teclado.nextInt();
			 
		}
		System.out.print("Dime cuantas veces copio ");
		int copia=teclado.nextInt();
		
		int array2[] = new int[array1.length*copia];
		
		for(int i = 0;i<copia;i++) {	
			System.arraycopy(array1, 0, array2, longi*i, array1.length);
		}
		
		for(int valor : array2) 
		{
			System.out.print(valor+" ");
		}
	}
}
