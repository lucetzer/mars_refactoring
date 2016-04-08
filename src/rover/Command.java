package rover;

public enum Command {

    M ("M") {
        @Override
        public void execute(MarsRover marsRover) {
            marsRover.move();
        }
    },
    L ("L") {
        @Override
        public void execute(MarsRover marsRover) {
            marsRover.turnLeft();
        }
    },
    R ("R") {
        @Override
        public void execute(MarsRover marsRover) {
            marsRover.turnRight();
        }
    };

    private String value;

    Command(String value) {
        this.value = value;
    }

    public abstract void execute(MarsRover marsRover);
}
