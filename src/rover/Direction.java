package rover;

public enum Direction {

    NORTH {
        @Override
        public Direction turnLeft() {
            return WEST;
        }

        @Override
        public Direction turnRight() {
            return EAST;
        }

        @Override
        public Position move(Position position) {
            return new Position(position.getX(), position.getY()+1);
        }
    },
    SOUTH {
        @Override
        public Direction turnLeft() {
            return EAST;
        }

        @Override
        public Direction turnRight() {
            return WEST;
        }

        @Override
        public Position move(Position position) {
            return new Position(position.getX(), position.getY()-1);
        }
    },
    EAST {
        @Override
        public Direction turnLeft() {
            return NORTH;
        }

        @Override
        public Direction turnRight() {
            return SOUTH;
        }

        @Override
        public Position move(Position position) {
            return new Position(position.getX()+1, position.getY());
        }
    },
    WEST {
        @Override
        public Direction turnLeft() {
            return SOUTH;
        }

        @Override
        public Direction turnRight() {
            return NORTH;
        }

        @Override
        public Position move(Position position) {
            return new Position(position.getX()-1, position.getY());
        }
    };

    public abstract Direction turnLeft();

    public abstract Direction turnRight();

    public abstract Position move(Position position);
}
