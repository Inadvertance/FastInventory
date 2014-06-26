/* Static class that is used to save and open objs into a .json file */

public static class Serializer {

	public enum Class {
		BOOK (Book), GAME (Game), MUSIC (Music), OTHER (Other), VIDEO (Video);

		private obj obj;
		Class(obj obj) {
			this.obj = obj;
		}
	}

	public static String Serialize(obj obj) {
		try {
			for (Class c : Class.values()) {
				if (obj instanceof c)
					return (new JSONSerializer().exclude("*.class").serialize(obj));
				System.out.println("Type error : could not serialize the given object.");
			}
		} catch (Exception e) {
			System.err.println("Error : could not use the given object " + e);
		}
	}
}