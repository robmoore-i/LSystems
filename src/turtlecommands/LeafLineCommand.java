package turtlecommands;

import turtle.Turtle;

public class LeafLineCommand implements TurtleCommand {
    @Override
    public void transform(Turtle turtle) {
        turtle.drawForward();
    }

    @Override
    public String toString() {
        return "turtlecommands.LeafLineCommand{}";
    }
}
