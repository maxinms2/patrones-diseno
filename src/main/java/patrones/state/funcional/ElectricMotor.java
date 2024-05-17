package patrones.state.funcional;

import java.util.function.Consumer;

public class ElectricMotor {
    private Consumer<String> state;

    public ElectricMotor(Consumer<String> state) {
        this.state = state;
    }

    public void setState(Consumer<String> state) {
        this.state = state;
    }

    public void start() {
        state.accept("Motor is already started.");
        state = MotorStateFunctions.STARTED;
    }

    public void accelerate() {
        state.accept("Motor must be started first.");
        state = MotorStateFunctions.RUNNING;
    }

    public void stop() {
        state.accept("Motor is not running.");
        state = MotorStateFunctions.STOPPED;
    }
}

