import java.util.ArrayList;
import java.util.Scanner;

final class Library {

	protected ArrayList<Book> books = new ArrayList<Book>();

	public Library addBook(Book type) {
		this.books.add(type);
		return this;
	}

	public ArrayList<Book> getBooks() {
		return this.books;
	}
}

abstract class Book {

	protected String title;
	protected String type;

	public Book(String title, String type) {
		 this.title=title;
		 this.type=type;
	}

	public String getTitle() {
		return this.title;
	}
	
	abstract public String getType();

}

class Novel extends Book {

	public Novel(String title, String type) {
		super(title,type);
	}

	public String getType() {
		return this.type;
	}
}
class TextBook extends Book {

	public TextBook(String title,String type) {
		super(title, type);
	}

	public String getType() {
		return this.type;
	}

}
class Comics extends Book {

	public Comics(String title ,String type) {
		super(title, type);
	}

	public String getType() {
		return this.type;
	}
}
class AddType extends Book {
	
	public AddType(String title, String type) {
		super(title, type);

	}

	public String getType(){
		return this.type;
	}
}

class Log {

	public static void info() {
		System.out.println("");
	}

	public static void info(String message) {
		System.out.println(message);
	}
}


public class Main {

	public static void main(String[] args) {

		Library library = new Library();
		Scanner scan = new Scanner(System.in);
	
		int x=0;

		do{

		Log.info("1.Dodaj Ksiązkę");
		Log.info("2.Wypisz Wszystkie");
		Log.info("3.Wypisz po Kategorii");
		 x = scan.nextInt();

		switch(x){

			case 1:

				Log.info("Wprowadź ilość książek");
				 int k=scan.nextInt();
			
				for(int i=0; i<k; ++i) {
					Log.info("Podaj Tytuł");
					String 	title=scan.next();
			

					Log.info();
					Log.info("Wprowadź Kategorie Książki");
				 	String category = scan.nextLine();
					
					library.addBook(new AddType(title,category));
					}
					break;
			case 2:

				for(Book book : library.getBooks()) {
					Log.info(book.getType() + " || " + book.getTitle());
					}
					break;
			case 3:

					Log.info("Wprowadź Kategorie Przeszukiwania");
					 String	category=scan.next();
					
				
			
					for(Book book : library.getBooks()) {
						if(book.getType().equals(category)) {
						Log.info(book.getType() + " || " + book.getTitle());
						}


					}
					break;
			default:
				x=5;
					break;
		}
	}while(x<4);
		
		/*

		library.addBook(new Novel("The Vector Prime","Novel"));
		library.addBook(new Comics("Star by Star","Comics"));
		library.addBook(new TextBook("The Unifying Force","Text book"));

		
	*/
	}
}