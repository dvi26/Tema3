package e6;

import java.util.Scanner;

public class Main6 {

		public static void main(String[] args) {
			int opc;
			double radio, altura;
			double resultado;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca opcion (1 o 2");
			opc = sc.nextInt();
			System.out.println("Introduzca radio");
			radio = sc.nextDouble();
			System.out.println("Introduzca altura");
			altura = sc.nextDouble();
			resultado= AreaVolumen.areaVolumen(opc, altura, radio);
			System.out.println(resultado);
			sc.close();

	}

}
