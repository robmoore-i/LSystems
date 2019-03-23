package turtle;

public class PopRecursionCommand extends TurtleCommand {
    @Override
    public void transform(Turtle turtle) {
        turtle.drawCurrentState();
        turtle.popState();
        turtle.turnRight();
    }

    @Override
    public String toString() {
        return "turtle.PopRecursionCommand{}";
    }
}
