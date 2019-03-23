package lsystem;

import turtle.Turtle;
import turtle.TurtleCommand;

public class LeftCommand implements TurtleCommand {
    @Override
    public void transform(Turtle turtle) {
        turtle.turnLeft();
        turtle.turnLeft();
    }
}
