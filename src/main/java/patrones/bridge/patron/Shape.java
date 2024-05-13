package patrones.bridge.patron;

//Abstraction
abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	abstract void draw();
}