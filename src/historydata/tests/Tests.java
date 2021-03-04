package historydata.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void regexMatchTest() {
		
		String input = "0000-00-21";
		
		boolean expected = true;
		boolean actual = input.matches("\\d{4}-\\d{2}-\\d{2}");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void regexMatchTest2() {
		
		String input = "0000-00-00T02:00Z";
		input = input.split("T")[0];
		
		boolean expected = true;
		boolean actual = input.matches("\\d{4}-\\d{2}-\\d{2}");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void regexMatchTest3() {
		
		String input = "0000-00-00t09:00t]T";
		input = input.split("t")[0];
		
		boolean expected = true;
		boolean actual = input.matches("\\d{4}-\\d{2}-\\d{2}");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void regexMatchTest4() {
		
		String input = "About 3 years";
		
		boolean expected = true;
		boolean actual = input.toLowerCase().contains("about");
		
		assertEquals(expected, actual);
	}
}
