/* Class that represents a book item */

public class Book {

	// TODO Compléter cette énumération au fur et à mesure
	public enum Type {
		ALPHABET, ANTHOLOGY, ARTIST, COFFEETABLE, COMICS, COOK, DIARY, DICTIONARY, FICTIONAL, GRAPHICNOVELS, GRIMOIRE,
		HISTORY, MONOGRAPH, NOTEBOOK, PHOTOSCOLLECTION, RELIGIOUS, SHORTSTORY;
	}
	
	String title, author, ref;
	int year;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, String ref) {
		this.title = title;
		this.author = author;
		this.ref = ref;
	}

	public Book(String title, String author, String ref, int year) {
		this.title = title;
		this.author = author;
		this.ref = ref;
		this.year = year;
	}

	// GETTERS
	public String getTitle() { return this.title; }
	public String getAuthor() { return this.author; }
	public String getRef() { return this.ref; }
	public int getYear() { return this.year; }

	// SETTERS
	public void setTitle(String newTitle) { this.title = newTitle; }
	public void setAuthor(String newAuthor) { this.author = newAuthor; }
	public void setRef(String newRef) { this.ref = newRef; }
	public void setYear(String newYear) { this.year = newYear; }
}