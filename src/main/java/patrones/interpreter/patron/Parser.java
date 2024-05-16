package patrones.interpreter.patron;

import java.util.Stack;

public class Parser {
	public static Expression parse(String expression) {
		Stack<Expression> stack = new Stack<>();
		for (String token : expression.split(" ")) {
			if (token.equals("+")) {
				Expression right = stack.pop();
				Expression left = stack.pop();
				Expression subExpression = new Plus(left, right);
				stack.push(subExpression);
			} else if (token.equals("-")) {
				Expression right = stack.pop();
				Expression left = stack.pop();
				Expression subExpression = new Minus(left, right);
				stack.push(subExpression);
			} else {
				Expression number = new Number(Integer.parseInt(token));
				stack.push(number);
			}
		}
		return stack.pop();
	}
}
