package ch09;

public class MockElevator implements Elevator {
    
    private class MockController implements ManualController {
        private int currentFloor;
        @Override
        public void up() {
            currentFloor++;
            MockElevator.this.currentFloor++;
        }

        @Override
        public void down() {
            currentFloor--;
        }
    }
    
    private int currentFloor;
    
    @Override
    public int getCurrentFloor() {
        return currentFloor;
    }
    
    @Override
    public ManualController getController() {
        return new MockController();
    }

}
