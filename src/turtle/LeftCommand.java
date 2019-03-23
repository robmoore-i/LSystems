package turtle;

public class LeftCommand implements TurtleCommand {
    @Override
    public void transform(Turtle turtle) {
        turtle.turnLeft();
        turtle.turnLeft();
    }
}
