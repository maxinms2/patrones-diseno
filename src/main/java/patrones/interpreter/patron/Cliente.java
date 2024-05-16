package patrones.interpreter.patron;

public class Cliente {
	public static void main(String[] args) {
		String expression = "10 20 + 5 -";
		Expression parsedExpression = Parser.parse(expression);
		System.out.println("Resultado: " + parsedExpression.interpret());
	}
}
