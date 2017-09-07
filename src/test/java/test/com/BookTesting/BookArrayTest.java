package test.com.BookTesting;

import static org.junit.Assert.*;


import org.junit.Test;

public class BookArrayTest {

//	@BeforeClass
//	public static void beforeTestMethod() {
//	
//	}

	@Test
	public void testGenre() {

		Service serv = new Service();
		Book book1 = new Book(1,"Book 1","Author 1","Crime");
		serv.addItem(book1);
		Book book2 = new Book(2,"Book 2","Author 2","Crime");
		serv.addItem(book2);
		Book book3 = new Book(3,"Book 3","Author 3","Horror");
		serv.addItem(book3);
		Book book4 = new Book(4,"Book 4","Author 4","Horror");
		serv.addItem(book4);
		Book book5 = new Book(5,"Book 5","Author 5","Horror");
		serv.addItem(book5);
		
		long countHorror = 3;
		String countCrimeHorror = "Horror";
		assertEquals(countHorror,serv.getNumberOfGenres(countCrimeHorror));
		
		long countCrime = 2;
		String countCrimeGenre = "Crime";
		assertEquals(countCrime,serv.getNumberOfGenres(countCrimeGenre));
		
	}

}
