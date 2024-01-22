package examples;

import static java.time.Duration.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TimeoutTest {
	@Test
	void timeoutNotExceeded() {
		// The following assertion succeeds.
		assertTimeout(ofSeconds(2), () -> {
			System.out.println("Test");
		});
	}

//	@Test
//	void timeoutExceeded() {
//		// The following assertion fails with an error message similar to:
//		// execution exceeded timeout of 10 ms by 91 ms
//		assertTimeout(ofMillis(10), () -> {
//			// Simulate task that takes more than 10 ms.
//			Thread.sleep(100);
//			System.out.println("Done!");
//		});
//	}
}
