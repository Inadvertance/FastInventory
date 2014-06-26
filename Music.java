/* Class that represents a music item */

public class Music {

	String title, artist, comment, album, genre;
	int year, duration;

	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public Music(String title, String artist, String album) {
		this.title = title;
		this.artist = artist;
		this.album = album;
	}

	public Music(String title, String artist, String album, String genre) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.genre = genre;
	}

	public Music(String title, String artist, String album, String genre, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.genre = genre;
		this.year = year;
	}

	public Music(String title, String artist, String album, String genre, int year, int duration) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.genre = genre;
		this.year = year;
		this.duration = duration;
	}

	// GETTERS
	public String getTitle() { return this.title; }
	public String getArtist() { return this.artist; }
	public String getComment() { return this.comment; }
	public String getAlbum() { return this.album; }
	public String getgenre() { return this.genre; }
	public int getYear() { return this.year; }
	public int getDuration() { return this.duration; }

	// SETTERS
	public void setTitle(String newTitle) { this.title = newTitle; }
	public void setArtist(String newArtist) { this.artist = newArtist; }
	public void setComment(String newComment) { this.comment = newComment; }
	public void setAlbum(String newAlbum) { this.album = newAlbum; }
	public void setgenre(String newGenre) { this.genre = newGenre; }
	public void setYear(int newYear) { this.year = newYear; }
}