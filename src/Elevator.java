public class Elevator {

    private int id;
    private Direction currentDirection;
    private int currentFloor;

    public int getId() {
        return id;
    }

    public Elevator setId(int id) {
        this.id = id;
        return this;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public Elevator setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
        return this;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Elevator setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
        return this;
    }
}
