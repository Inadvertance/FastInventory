/* Class that represents a video game item */

public class Game {

	public enum Type {
		ACTION, ACTIONADVENTURE, ADVENTURE, MMO, RPG, SIMULATION, STRATEGY, SURVIVAL, UNKNOWN;
	}
	public enum Platform {
		PC, PS1, PS2, PS3, PS4, XBOX, XBOX360, NES, WII, WIIU, DS, 3DS;
	}
	String title, editor;
	int duration;
	Type type;
	Platform platform;

	public Game(String title, String editor) {
		this.title = title;
		this.editor = editor;
		this.type = Type.UNKNOWN;
	}

	public Game(String title, String editor, Type type) {
		this.title = title;
		this.editor = editor;
		this.type = type;
	}

	public Game(String title, String editor, Type type, Platform platform) {
		this.title = title;
		this.editor = editor;
		this.type = type;
		this.platform = platform;
	}

	// GETTERS
	public String getTitle() { return this.title; }
	public String getEditor() { return this.editor; }
	public Type getType() { return this.type; }
	public Platform getPlatform() { return this.platform; }

	// SETTERS
	public void setTitle(String newTitle) { this.title = newTitle; }
	public void setEditor(String newEditor) { this.editor = newEditor; }
	public void setType(Type newType) { this.type = newType; }
	public void setPlatform(Platform platform) { this.platform = platform; }
}