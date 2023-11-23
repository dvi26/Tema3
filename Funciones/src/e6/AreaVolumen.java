package e6;

public class AreaVolumen {
	public static double areaVolumen(int opc, double altura, double radio) {
		double res=0;
		switch (opc) {
		case 1 : res = 2*Math.PI*radio*(altura+radio);
		case 2 : res = Math.PI*radio*radio*altura;
		}	
		return res;
	}
}

