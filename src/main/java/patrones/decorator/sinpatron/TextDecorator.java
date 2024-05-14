package patrones.decorator.sinpatron;

public class TextDecorator {
	public static void main(String[] args) {
		String text = "Hello, World!";
		System.out.println(decorateText(text, true, false, true));
	}

	public static String decorateText(String text, boolean toUpperCase, boolean addExclamation, boolean addStars) {
		if (toUpperCase) {
			text = text.toUpperCase();
		}
		if (addExclamation) {
			text += "!!!";
		}
		if (addStars) {
			text = "***" + text + "***";
		}
		return text;
	}
}
