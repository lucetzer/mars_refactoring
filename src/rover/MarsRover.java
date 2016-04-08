package rover;

import java.util.ArrayList;
import java.util.List;
public class MarsRover {

    private Position position;
    private Direction direction;

    public MarsRover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public String run(String input) {
        List<Command> commands = convertInputIntoValidCommands(input);
        for (Command command : commands) {
            command.execute(this);
        }
        return asString();
    }

    public void move() {
        position = direction.move(position);
    }

    private String asString() {
        return position.getX() + " " + position.getY() + " " + direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    private List<Command> convertInputIntoValidCommands(String input) {
        String[] commandStringArray = input.split("(?!^)");
        List<Command> commands = new ArrayList<>();
        for (String command : commandStringArray) {
            commands.add(Command.valueOf(command));
        }
        return commands;
    }
}
