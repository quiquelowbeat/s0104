package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class DniTest {

	@ParameterizedTest
	@CsvSource({ "19891789,D", "33126574,L", "43711948,B", "61423650,B", "65504413,E", "60234600,S", "29936929,Z", "71143680,B", "14485685,D", "95082392,R"})

	void testLetter(int numbers, char letter) {
		
		assertEquals(CalculoDni.getLetter(numbers), letter);
		// assertTrue(CalculoDni.getLetter(numbers) == letter);
		// assertTrue(Character.compare(CalculoDni.getLetter(numbers), letter) == 0);
		// Test de diferents maneres de trobar la igualtat dels dos chars.
		
	}
	
}
