import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class MovieAppTest {

	@Test
	void testDVDTitleRun() {
		Movie result = new DVD ("The Emperor's New Groove", 79, List.of("Hot Latin chart ft. Tom Jones", "Kuszco Meets Pacha", "Cat Woman as Yzma", "He's a llamma now", "Patrick Warburton, himbo??"));
		assertEquals("The Emperor's New Groove", result.getTitle());
		assertEquals(79, result.getRunTime());
	}
	
	@Test
	void testVHSTitleRunTime() {
		VHS result = new VHS ("The Emperor's New Groove", 79, List.of("Hot Latin chart ft. Tom Jones", "Kuszco Meets Pacha", "Cat Woman as Yzma", "He's a llamma now", "Patrick Warburton, himbo??"));
		assertEquals("The Emperor's New Groove", result.getTitle());
		assertEquals(79, result.getRunTime());
		assertEquals(0, result.getCurrentTime());
	}
	@Test
	void testPlay() {
		VHS result = new VHS ("The Emperor's New Groove", 79, List.of("Hot Latin chart ft. Tom Jones", "Kuszco Meets Pacha", "Cat Woman as Yzma", "He's a llamma now", "Patrick Warburton, himbo??"));
		result.play();
		assertEquals(1, result.getCurrentTime());
	}
	@Test
	void testRewind() {
		VHS result = new VHS ("The Emperor's New Groove", 79, List.of("Hot Latin chart ft. Tom Jones", "Kuszco Meets Pacha", "Cat Woman as Yzma", "He's a llamma now", "Patrick Warburton, himbo??"));
		result.play();
		result.rewind();
		assertEquals(0, result.getCurrentTime());
	}
}
