package turtle;

import turtle.Turtle;
import turtle.TurtleCommand;

public class PushRecursionCommand extends TurtleCommand {
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
