package condicinales;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		int x,y,suma, resta,mult,div;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame x");
		x = teclado.nextInt();
		
		System.out.println("Dame y");
		y = teclado.nextInt();
		
		suma = x + y;
		resta = x - y;
		mult = x * y;
		div = x / y;
		
		System.out.println("Suma: " + suma);
		System.out.println("Resta: "+ resta);
		System.out.println("Multiplicacion: " + mult);
		System.out.println("Division: " + div);
		
		teclado.close();
	}

}
