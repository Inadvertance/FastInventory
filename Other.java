/* Class that represents any other item */

public class Other {

	String name, comment;

	public Other(String name) {
		this.name = name;
	}

	public Other(String name, String comment) {
		this.name = name;
		this.comment = comment;
	}
	
	// GETTERS
	public String getName() { return this.name; }
	public String getComment() { return this.comment; }

	// SETTERS
	public void setName(String newName) { this.name = newName; }
	public void setComment(String newComment) { this.comment = newComment; }
}