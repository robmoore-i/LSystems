package turtle;

import turtle.Turtle;
import turtle.TurtleCommand;

public class LineCommand extends TurtleCommand {
    @Override
    public void transform(Turtle turtle) {
        turtle.drawForward();
    }

    @Override
    public String toString() {
        return "turtle.LineCommand{}";
    }
}
