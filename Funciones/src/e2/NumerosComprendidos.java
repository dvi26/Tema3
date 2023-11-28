package e2;

public class NumerosComprendidos {
	public static int nComprendidos(int n1, int n2) {
	
		int contador = n1>n2?n2:n1;
		int contador2 = n1<n2?n2:n1;
		while (contador<=contador2) {
		System.out.println(contador);
		contador++;
		}
	return contador;
}}
