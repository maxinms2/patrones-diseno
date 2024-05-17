package patrones.state.funcional;

import java.util.function.Consumer;

public class MotorStateFunctions {

    public static final Consumer<String> START = message -> System.out.println("Starting motor... " + message);
    public static final Consumer<String> ACCELERATE = message -> System.out.println("Accelerating motor... " + message);
    public static final Consumer<String> STOP = message -> System.out.println("Stopping motor... " + message);

    public static final Consumer<String> DO_NOTHING = message -> System.out.println("Motor is already in this state. " + message);

    public static final Consumer<String> STARTED = DO_NOTHING.andThen(START);
    public static final Consumer<String> RUNNING = DO_NOTHING.andThen(ACCELERATE);
    public static final Consumer<String> STOPPED = DO_NOTHING.andThen(STOP);
}

