package turtle;

public class PushRecursionCommand implements TurtleCommand {
    @Override
    public void transform(Turtle turtle) {
        turtle.drawCurrentState();
        turtle.pushState();
        turtle.turnLeft();
    }

    @Override
    public String toString() {
        return "turtle.PushRecursionCommand{}";
    }
}
