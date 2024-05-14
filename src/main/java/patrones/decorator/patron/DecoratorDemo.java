package patrones.decorator.patron;

//Component Interface
interface Text {
 String format();
}

//Concrete Component
class PlainText implements Text {
 private String text;

 public PlainText(String text) {
     this.text = text;
 }

 @Override
 public String format() {
     return text;
 }
}

//Decorator Base Class
abstract class TextDecorator implements Text {
 protected Text text;

 public TextDecorator(Text text) {
     this.text = text;
 }
}

//Concrete Decorators
class UpperCaseDecorator extends TextDecorator {
 public UpperCaseDecorator(Text text) {
     super(text);
 }

 @Override
 public String format() {
     return text.format().toUpperCase();
 }
}

class ExclamationDecorator extends TextDecorator {
 public ExclamationDecorator(Text text) {
     super(text);
 }

 @Override
 public String format() {
     return text.format() + "!!!";
 }
}

class StarDecorator extends TextDecorator {
 public StarDecorator(Text text) {
     super(text);
 }

 @Override
 public String format() {
     return "***" + text.format() + "***";
 }
}

//Usage
public class DecoratorDemo {
 public static void main(String[] args) {
     Text text = new PlainText("Hello, World!");
     text = new UpperCaseDecorator(text);
     text = new ExclamationDecorator(text);
     text = new StarDecorator(text);
     System.out.println(text.format());
 }
}

