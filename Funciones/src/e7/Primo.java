package e7;

public class Primo {
public static boolean esPrimo(int n) {
	boolean res;
	if (n%2==0 || n%3==0 || n%5==0 || n%7==0) {
		res=false;
	}else {
		res=true;
}
	return res;	
}}
