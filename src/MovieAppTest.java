import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class MovieAppTest {

	@Test
	void testDVDTitleRun() {
		Movie result = new Movie ("The Emperor's New Groove", 79, List.of("Hot Latin chart ft. Tom Jones", "Kuszco Meets Pacha", "Cat Woman as Yzma", "He's a llamma now", "Patrick Warburton, himbo??"),new DVD());
		assertEquals("The Emperor's New Groove", result.getTitle());
		assertEquals(79, result.getRunTime());
	}
	
	@Test
	void testVHSTitleRunTime() {
		Movie result = new Movie ("The Emperor's New Groove", 79, List.of("Hot Latin chart ft. Tom Jones", "Kuszco Meets Pacha", "Cat Woman as Yzma", "He's a llamma now", "Patrick Warburton, himbo??"), new VHS());
		assertEquals("The Emperor's New Groove", result.getTitle());
		assertEquals(79, result.getRunTime());
		assertEquals(0, ((VHS)result.getIplay()).getCurrentTime());
	}
	@Test
	void testPlay() {
		Movie result = new Movie ("The Emperor's New Groove", 79, List.of("Hot Latin chart ft. Tom Jones", "Kuszco Meets Pacha", "Cat Woman as Yzma", "He's a llamma now", "Patrick Warburton, himbo??"), new VHS());
		result.play();
		assertEquals(1, ((VHS)result.getIplay()).getCurrentTime());
	}
	@Test
	void testRewind() {
		Movie result = new Movie ("The Emperor's New Groove", 79, List.of("Hot Latin chart ft. Tom Jones", "Kuszco Meets Pacha", "Cat Woman as Yzma", "He's a llamma now", "Patrick Warburton, himbo??"), new VHS());
		result.play();
		((VHS)result.getIplay()).rewind();
		assertEquals(0, ((VHS)result.getIplay()).getCurrentTime());
	}
}
