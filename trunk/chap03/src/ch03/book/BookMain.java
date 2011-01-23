package ch03.book;

public class BookMain {

	public static void main(String[] args) {
		BookCatalog catalog = new BookCatalog();
		if (args.length == 0) {
			printUsage();
			return;
		}
		
		if (args[0].equals("-a")) {
			catalog.printAllBooks();
			return;
		}
		
		if (args[0].equals("-k")) {
			catalog.printBooksTitleLike(args[1]);
		}
	}
	
	private static void printUsage() {
		System.out.println("��ü ���: java ch03.book.BookMain -a");
		System.out.println("�˻� ���: java ch03.book.BookMain -k �ܾ�");
	}
}
