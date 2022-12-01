package bucles;

import java.util.Iterator;

public class Bucles {

	public static void main(String[] args) {
		int num=1;
		System.out.println("Bucle while");
		while(num<=10) {
			
			System.out.print(num+", ");
			num++;
		}
		System.out.println("\nBucle dowhile");
		num=1;
		do{
			
			System.out.print(num+", ");
			num++;
			
		}while(num<=10);
		System.out.println("\nBucle for");
		for (num=1; num<=10;num++) {
			
			System.out.print(num+", ");
			
		}
		System.out.println("\nBucle foreach");
	}
}
