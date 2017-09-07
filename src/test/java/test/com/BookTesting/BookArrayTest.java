package test.com.BookTesting;

import org.junit.Test;

import junit.framework.TestCase;

public class BookArrayTest extends TestCase {
	@Test
	public void testBookCreated () {
		assertNotNull(book1);
	}	
	
	@Test
	public void testBooksHorror () {
		int countHorror = 2;
		assertsEquals(countHorror, countActualHorror);
		
	}
	
	@Test
	public void testBooksCrime () {
		int countCrime = 2;
		assertEquals(countCrime, countActualCrime);
	}
	
	
}

	
	