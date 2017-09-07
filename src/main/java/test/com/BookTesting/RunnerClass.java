package test.com.BookTesting;

public class RunnerClass {

	public static void main(String[] args) {

		Service serv = new Service();

		Book book1 = new Book(1,"Book 1","Author 1","Crime");
		serv.addItem(book1);
		Book book2 = new Book(2,"Book 2","Author 2","Crime");
		serv.addItem(book2);
		Book book3 = new Book(3,"Book 3","Author 3","Horror");
		serv.addItem(book3);
		Book book4 = new Book(4,"Book 4","Author 4","Horror");
		serv.addItem(book4);


	}

}