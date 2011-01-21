package ch03.book;

public class Book {

	private String isbn;
	private String title;
	private int price;

	public Book(String isbn, String title, int price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public boolean titleLike(String isbn) {
		if (isbn == null)
			return false;

		return this.isbn.equals(isbn);
	}

	public void printInfo() {
		System.out.println("����:" + title + ", ����:" + price + ", ISBN=" + isbn);
	}

}
