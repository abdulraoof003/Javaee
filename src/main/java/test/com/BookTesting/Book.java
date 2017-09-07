package test.com.BookTesting;

public class Book {

	private int itemId;

	private String name;

	private String author;

	private String genre;

	public Book(int itemId, String name, String author, String genre) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.author = author;
		this.genre = genre;
	}

	public int getItemId() {

		return itemId;

	}

	public String getName() {

		return name;

	}

	public String getAuthor() {

		return author;

	}

	public String getGenre() {

		return genre;

	}

	public void setItemId(int newItemId) {

		itemId = newItemId;

	}

	public void setName(String newName) {

		name = newName;

	}

	public void setAuthor(String newAuthor) {

		author = newAuthor;
	}

	public void setGenre(String newGenre) {

		author = newGenre;

	}

}
