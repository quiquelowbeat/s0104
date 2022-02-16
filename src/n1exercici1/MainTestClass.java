package n1exercici1;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTestClass {
	
    private final MonthsClass months = new MonthsClass();
	
	@Test
	void testSize() {
		
		System.out.println("Test size");
		assertEquals(12, months.getSize());
		
	}

	@Test
	void testIsNull() {
		
		System.out.println("Test null");
		assertFalse(months.arrayIsEmpty() || months == null);
	
	}

	@Test
	void testAugust() {
		
		System.out.println("Test August");
		assertEquals("Agosto", months.getAugust());
		
	}

}

