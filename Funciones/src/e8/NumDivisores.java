package e8;

public class NumDivisores {
	public static int esPrimo(int n1) {
		int contador=2;
		if (n1%2==0) {
			contador++;
		}
		if (n1%5==0){
			contador++;
		}
			if (n1%7==0){
				contador++;
			}
				 if (n1%2==0){
					contador++;
				 }
				 if (n1==1) {
					 contador=1;
				 }
				 
	return contador;
}}
