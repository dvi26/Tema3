package e8;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		int n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		n1=sc.nextInt();
		int contador= NumDivisores.esPrimo(n1);
		System.out.println("Hay " + contador + " divisores primos");
		sc.close();
	}

}
