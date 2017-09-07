package test.com.BookTesting;

import java.util.HashMap;

public class Service {

	public void helloWord() {
		System.out.println("Hello");
	}

	int key = 1;

	public HashMap<Integer, Book> map = new HashMap<Integer, Book>();

	public void addItem(Book I) {

		map.put(key, I);

		key++;

	}

	public long getNumberOfGenres(String genre) {
		return (map.values().stream().filter(eachBook -> eachBook.getGenre().equals(genre)).count());
	}
	
	public void helloWorld() {
		System.out.println("Hello World");
	}

}
