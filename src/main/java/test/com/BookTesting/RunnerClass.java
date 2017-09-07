package test.com.BookTesting;

import java.io.File;

import java.util.HashMap;

public class RunnerClass {

	public static void main(String[] args) {

		Service serv = new Service();

		Book book1 = new Book();

		book1.setItemId(1);

		book1.setName("The Hobbit");

		book1.setAuthor("J R Tolkien");

		Book book2 = new Book();

		book2.setItemId(2);

		book2.setName("The Lord of The Rings");

		book2.setAuthor("J R Tolkien");

		serv.addItem(book1);

		serv.addItem(book2);

	}

}