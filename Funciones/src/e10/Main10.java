package e10;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		int dia, mes, año;
		boolean esCorrecta;
		System.out.println("Introduzca");
		Scanner sc = new Scanner(System.in);
		dia=sc.nextInt();
		System.out.println("Introduzca");
		mes=sc.nextInt();
		System.out.println("Introduzca");
		año=sc.nextInt();
		esCorrecta = CompruebaFecha.esFechaCorrecta(dia, mes, año);
		System.out.println(esCorrecta);
		sc.close();
	}}

	


