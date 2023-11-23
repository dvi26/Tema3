package e4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		String caracter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca");
		caracter=sc.next();
		boolean esVocal = Vocal.CompruebaVocal(caracter);
		System.out.println(esVocal);
		sc.close();
}}

	


