package test.com.BookTesting;

import java.io.File;

import java.util.HashMap;

public class Service {

	int key = 1;

	public HashMap<Integer, Book> map = new HashMap<Integer, Book>();

	public void addItem(Book I) {

		map.put(key, I);

		key++;

	}

	public long getNumberOfGenres(String genre) {
		return map.values().stream().filter(eachBook -> eachBook.getGenre().equals(genre)).count();
	}

	// Need to include java 8 in maven to work.
	// public long searchGenreHorror(String genre) {
	// int count = 0;
	// for (book eachbook : bookMap.values() {
	// if (eachboo)
	// }
	// }

}
