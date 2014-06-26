/* Class that represents a video item */

public class Video {

	public enum Type {
		VIDEO, FILM, SERIES, SHOW;
	}
	String title, author;
	int duration;
	Type type;

	public Video(String title) {
		this.title = title;
		this.author = "Unknown";
	}

	public Video(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Video(String title, String author, int duration) {
		this.title = title;
		this.author = author;
		this.duration = duration;
	}

	public Video(String title, String author, int duration, Type type) {
		this.title = title;
		this.author = author;
		this.duration = duration;
		this.type = type;
	}

	// GETTERS
	public String getTitle() { return this.title; }
	public String getAuthor() { return this.author; }
	public int getDuration() { return this.duration; }
	public Type getType() { return this.type; }

	// SETTERS
	public void setTitle(String newTitle) { this.title = newTitle; }
	public void setAuthor(String newAuthor) { this.author = newAuthor; }
	public void setType(Type newType) { this.type = newType; }
}