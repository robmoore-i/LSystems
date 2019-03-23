package turtle;

public class RightCommand implements TurtleCommand {
    @Override
    public void transform(Turtle turtle) {
        turtle.turnRight();
        turtle.turnRight();
    }
}
