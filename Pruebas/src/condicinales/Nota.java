package condicinales;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {

			Scanner teclado = new Scanner(System.in);

			System.out.println("Dame tu nota: ");
			int nota = teclado.nextInt();
			
			if(nota < 5)
			{		
				
				System.out.println("Insuficiente");
				
			}else if(nota < 6)
			{
				
				System.out.println("Suficiente");
				
			}else if (nota < 7)
			{
				System.out.println("Bien");
				
			}else if(nota < 9)
			{
			
				System.out.println("Notable");
				
			}else
			{
				
				System.out.println("Sobresaliente");
			
			}
			
			teclado.close();

	}

}
