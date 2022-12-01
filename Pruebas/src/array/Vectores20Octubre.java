package array;
import java.io.IOException;
import java.util.Scanner;

public class Vectores20Octubre {

	public static void main(String[] args) throws IOException {
	
		Scanner teclado=new Scanner(System.in);
		int cont;
		char mivectorcaracteres[]=new char[3];
		System.out.println("longitud mivectorcaracteres " + mivectorcaracteres.length);
		int[] mivectordigitos=new int[5];
		System.out.println("longitud mivectordigitos " + mivectordigitos.length);
		int mivectordigitos2[]= {3,7,4,4,4,1};
		System.out.println("longitud mivectordigitos2 " + mivectordigitos2.length);
		
		mivectorcaracteres[0]='a';
		mivectordigitos[0]=2;
		
		//rellenar el vectordigitos con numeros del 0 hasta la longitud.
		for (int i=0;i<mivectordigitos.length;i++)
			mivectordigitos[i]= i;
		//rellenar el vectorcaracteres con letras que se le piden al usuario
		for (int i=0;i<mivectorcaracteres.length;i++)
		{
			System.out.println("introduzca una letra");
			mivectorcaracteres[i]=teclado.next().charAt(0);
				
		}
	
		//mostrar todos los valores del vector de caracteres

		for (cont=0;cont<mivectorcaracteres.length;cont++)
		{
			System.out.println("El valor de la posici�n " +cont + "del vector1 es " + mivectorcaracteres[cont]);
				
		}
		
		//otra forma de recorrer todos los valores.
		
		for (char valor: mivectorcaracteres)
		{
			System.out.println(valor);
				
		}
		
		// Sumar los valores del vectordedigitos	
		int suma=0;
		for (cont=0;cont<mivectorcaracteres.length;cont++)
		{
			suma=suma + mivectordigitos[cont];
				
		}
		System.out.println("El valor de la suma del vector de digitos es  " + suma);
	
		int vectorcopiafalso[];
		vectorcopiafalso=mivectordigitos;
		mivectordigitos[0]=8;
		
		//lo anterior no es copiar es crear un variable que apunte al mismo sitio,
		//luego realmente estoy actuando sobre la misma posici�n de memoria desde dos
		//punteros.
		
		//Para copia hay que ir cargando valor a valor
		int vectorcopiareal[]=new int [mivectordigitos.length];
		for (cont=0;cont<mivectordigitos.length;cont++)
			vectorcopiareal[cont]=mivectordigitos[cont];
		vectorcopiareal[0]=9;
		int otracopiavector[] = new int [mivectordigitos.length];
		
		//origen, posicion, destino, posicion, cantidad
		System.arraycopy(mivectordigitos, 0, otracopiavector, 0, mivectordigitos.length);
	}
	
	
		
		
		
		

		
	

}
