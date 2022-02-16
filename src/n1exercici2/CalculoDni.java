package n1exercici2;

public class CalculoDni {

	private static char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

	public static char getLetter(int numDni) {
		
		return letters[(numDni % 23)];
		
	}
	
}
