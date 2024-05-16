package patrones.interpreter.patron;

class Number implements Expression {
	private int number;

	public Number(int number) {
		this.number = number;
	}

	public int interpret() {
		return number;
	}
}
