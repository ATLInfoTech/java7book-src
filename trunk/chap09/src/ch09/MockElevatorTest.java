package ch09;

public class MockElevatorTest {

    public static void main(String[] args) {
        MockElevator elevator = new MockElevator();
        ManualController controller = elevator.getController();
        controller.up();
        System.out.println("up���� = " + elevator.getCurrentFloor());
        controller.up();
        System.out.println("up���� = " + elevator.getCurrentFloor());
        controller.down();
        System.out.println("down���� = " + elevator.getCurrentFloor());
    }
}
