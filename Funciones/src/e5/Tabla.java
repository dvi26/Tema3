package e5;

public class Tabla {
public static int tablaM(int n1) {
	int contador=0, resultado=0;
while (contador<=10) {
	resultado=contador*n1;
	System.out.println(n1 + "x" + contador + "=" + resultado);
	contador++;
}
return n1;
}}
