package e1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		n1=sc.nextInt();
		int contador=Eco.eco(n1);		
		
		while (contador > 0) {
		System.out.println("Eco...");
		contador--;
	}
		sc.close();
	}}



	


