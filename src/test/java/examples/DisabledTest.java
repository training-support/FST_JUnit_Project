package examples;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Disable test from class")
public class DisabledTest {
	// Ignored test method
	@Test
//	@Disabled("Not implemented")
	void testCustomerServiceGet() {
		System.out.println("This statement will not execute");
		assertEquals(2, 1 + 1);
	}

	// Test method that will execute
	@Test
	void test3Plus3() {
		assertEquals(6, 3 + 3);
	}
}