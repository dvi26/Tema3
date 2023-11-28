package e5;

import java.util.Scanner;

import e2.NumerosComprendidos;

public class Main5 {

	public static void main(String[] args) {
		int n1, resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		n1=sc.nextInt();
		int contador = Tabla.tablaM(n1);
	}

}
