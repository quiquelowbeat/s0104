package n1exercici3;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThrowClassTest {

	@Test
	void testThrow() {
		
		try {
			
			ThrowClass.getThrow();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
			
		} 
		
	}

}
