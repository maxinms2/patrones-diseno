package patrones.state.sinpatron;

public class ElectricMotor {
	private static final int STOPPED = 0;
	private static final int STARTED = 1;
	private static final int RUNNING = 2;

	private int state;

	public ElectricMotor() {
		state = STOPPED;
	}

	public void start() {
		if (state == STOPPED) {
			System.out.println("Starting motor...");
			state = STARTED;
		} else {
			System.out.println("Motor is already started.");
		}
	}

	public void accelerate() {
		if (state == STARTED) {
			System.out.println("Accelerating motor...");
			state = RUNNING;
		} else {
			System.out.println("Motor must be started first.");
		}
	}

	public void stop() {
		if (state == RUNNING) {
			System.out.println("Stopping motor...");
			state = STOPPED;
		} else {
			System.out.println("Motor is not running.");
		}
	}
}
