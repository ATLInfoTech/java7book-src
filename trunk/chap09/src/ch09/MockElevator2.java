package ch09;

public class MockElevator2 implements Elevator {
    private int currentFloor;
    
    @Override
    public int getCurrentFloor() {
        return currentFloor;
    }

    @Override
    public ManualController getController() {
        return new ManualController() {

            @Override
            public void up() {
                currentFloor++;
            }

            @Override
            public void down() {
                currentFloor--;
            }
        };
    }

}
