package funciones;

public class PruebasFunciones {
	public static void imprimeHolaMundo() {
		System.out.println("Hola mundo");
	}
	public static int doble(int a) {
		int resultado= a *2;
		return resultado;
	}
	public static int multiplica(int a,int b) {
		int resultado= a * b;
		return resultado;
	}
	
	public static void main(String[] args) {
		imprimeHolaMundo();
		int a = doble(10); // a = 20 (10*2)
		int b = multiplica(3, 5); // b = 15 (3*5)
		System.out.println("El valor de a: " + a);
		System.out.println("El valor de b: " + b);
		
		int c = doble(a); // c = 40 (20*2)
		int d = multiplica(a, b); // d = 300 (20*15)
		System.out.println("El valor de c: " + c);
		System.out.println("El valor de d: " + d);
		
		int e = doble(4) + multiplica(2,10); // e = 8 + 20
		System.out.println("El valor de e: " + e);
		System.out.println("El doble de 35 es " + doble(35) ); // “El doble de 35 es 70”
		System.out.println("12 por 12 es " + multiplica(12,12) ); // “12 por 12 es 144”


	}

}
