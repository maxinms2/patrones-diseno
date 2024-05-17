package patrones.state.funcional;

public class Cliente {
    public static void main(String[] args) {
        ElectricMotor motor = new ElectricMotor(MotorStateFunctions.STOPPED);

        motor.start(); // Output: Starting motor...
        motor.accelerate(); // Output: Motor must be started first.
        motor.start(); // Output: Motor is already started.
        motor.accelerate(); // Output: Accelerating motor...
        motor.stop(); // Output: Stopping motor...
    }
}
