package patrones.interpreter.patron;

class Plus implements Expression {
	Expression leftOperand;
	Expression rightOperand;

	public Plus(Expression left, Expression right) {
		leftOperand = left;
		rightOperand = right;
	}

	public int interpret() {
		return leftOperand.interpret() + rightOperand.interpret();
	}
}
