package e10;

public class CompruebaFecha {
	public static boolean esFechaCorrecta(int dia, int mes, int año){
		boolean esCorrecta=false;
		
		if (dia>0 && dia < 31 && mes > 0 && mes <13) {
			esCorrecta=true;
	}
			return esCorrecta;
}}


