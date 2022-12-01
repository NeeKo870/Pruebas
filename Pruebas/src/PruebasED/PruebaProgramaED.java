package PruebasED;

import java.util.Scanner;
public class PruebaProgramaED{
	public static void main(String[] args) {	

		int array1[] = new int[10];
		Scanner scan = new Scanner(System.in);	
		
		for(int i=0;i <array1.length;i++)
		{
			System.out.println("Dame numero");
			array1[i]=scan.nextInt();
		}
		for(int i=0;i<array1.length;i++)
		{
			System.out.println("Numero " + array1[i]);
			
		}
	}
}