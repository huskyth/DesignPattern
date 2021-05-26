package iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		bookShelf.appendBook(new Book("°ÁÂýÓëÆ«¼û"));
		bookShelf.appendBook(new Book("Hamlet"));
		Iterator iterator = bookShelf.iterator();
		while (iterator.hasNext()){
			Book book = (Book)iterator.next();
			System.out.println(book.getName());
		}
	}

}
