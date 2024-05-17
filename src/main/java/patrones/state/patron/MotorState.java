//package patrones.state.patron;
//
////Interface for all states
//interface MotorState {
// void start();
// void accelerate();
// void stop();
//}
//
////Concrete state classes
//class StoppedState implements MotorState {
// @Override
// public void start() {
//     System.out.println("Starting motor...");
// }
//
// @Override
// public void accelerate() {
//     System.out.println("Motor must be started first.");
// }
//
// @Override
// public void stop() {
//     System.out.println("Motor is already stopped.");
// }
//}
//
//class StartedState implements MotorState {
// @Override
// public void start() {
//     System.out.println("Motor is already started.");
// }
//
// @Override
// public void accelerate() {
//     System.out.println("Accelerating motor...");
// }
//
// @Override
// public void stop() {
//     System.out.println("Stopping motor...");
// }
//}
//
//class RunningState implements MotorState {
// @Override
// public void start() {
//     System.out.println("Motor is already started.");
// }
//
// @Override
// public void accelerate() {
//     System.out.println("Motor is already running at full speed.");
// }
//
// @Override
// public void stop() {
//     System.out.println("Stopping motor...");
// }
//}
//
////Context class
//public class ElectricMotor {
// private MotorState state;
//
// public ElectricMotor() {
//     state = new StoppedState();
// }
//
// public void setState(MotorState state) {
//     this.state = state;
// }
//
// public void start() {
//     state.start();
//     if (state instanceof StoppedState)
//         setState(new StartedState());
// }
//
// public void accelerate() {
//     state.accelerate();
//     if (state instanceof StartedState)
//         setState(new RunningState());
// }
//
// public void stop() {
//     state.stop();
//     if (state instanceof RunningState || state instanceof StartedState)
//         setState(new StoppedState());
// }
//}
