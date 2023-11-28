package e7;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		n=sc.nextInt();
		boolean solucion= Primo.esPrimo(n);
		System.out.println("¿Es el número primo?: " + solucion);
		sc.close();
	}

}
