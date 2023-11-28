package e3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		n1=sc.nextInt();
		System.out.println("Introduzca otro numero");
		n2=sc.nextInt();
		int contador = NumMaximo.nMaximo(n1, n2);
		System.out.println(contador);
		sc.close();
	}

}
