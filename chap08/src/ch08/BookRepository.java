package ch08;

public class BookRepository implements Repository<Book, String> {

	@Override
	public void add(Book e) { }

	@Override
	public Book find(String id) { return null; }
	
}
