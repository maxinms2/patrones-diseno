package patrones.bridge.patron;

//RefinedAbstraction
class Circle extends Shape {
	Circle(DrawAPI drawAPI) {
		super(drawAPI);
	}

	void draw() {
		drawAPI.drawCircle();
	}
}