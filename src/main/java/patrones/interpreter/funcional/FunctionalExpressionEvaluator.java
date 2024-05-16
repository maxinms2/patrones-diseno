package patrones.interpreter.funcional;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.function.BiFunction;

public class FunctionalExpressionEvaluator {

	private static final Map<String, BiFunction<Integer, Integer, Integer>> OPERATIONS = Map.of("+", (a, b) -> a + b,
			"-", (a, b) -> a - b);

	public static int evaluate(String expression) {
		String[] tokens = expression.split(" ");
		Deque<Integer> numbers = new ArrayDeque<>();

		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			if (OPERATIONS.containsKey(token)) {
				int right = numbers.pop();
				int left = numbers.pop();
				numbers.push(OPERATIONS.get(token).apply(left, right));
			} else {
				numbers.push(Integer.parseInt(token));
			}
		}

		return numbers.pop();
	}

	public static void main(String[] args) {
		String expression = "10 20 + 5 -";
		System.out.println("Resultado: " + evaluate(expression));
	}
}
