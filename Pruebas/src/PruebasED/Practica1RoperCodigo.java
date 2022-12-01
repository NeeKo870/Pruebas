package PruebasED;

import java.util.Scanner;

public class Practica1RoperCodigo {

	public static void main(String[] args) {
       
        int numero = 1;
        try (Scanner teclado = new Scanner(System.in)) {
			//pedimos numero
			System.out.printf("Introduzca un número entero: ");
			numero = teclado.nextInt();
			
			//comprobamos que solo tiene un digito
			do{           
			    
			    System.out.printf("Error vuelva a introducir un número entero de 1 solo digito: ");
			    numero = teclado.nextInt();
			}while(numero > 9);
		}
        //creamos la variable contador para multiplicarlo por el numero hasta que el contador llege a 10
        int contador = 0;
        do{                 
            System.out.printf("%d x %d = %02d\n",numero,contador,(numero * contador));
            contador++;
        }while(contador <= 10);   
	}

}
