package e4;

public class Vocal {
	public static boolean CompruebaVocal(String caracter) {
		boolean res=false;
		switch (caracter) {
		case "A", "I", "O", "U", "E", "a", "e", "i", "o", "u" -> res=true;
		default -> res=false;
		}
		return res;
	}}

