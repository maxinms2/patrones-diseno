package patrones.bridge.patron;

class Square extends Shape {
	Square(DrawAPI drawAPI) {
		super(drawAPI);
	}

	void draw() {
		drawAPI.drawSquare();
	}
}