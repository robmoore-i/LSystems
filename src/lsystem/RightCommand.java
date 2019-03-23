package lsystem;

import turtle.Turtle;
import turtle.TurtleCommand;

public class RightCommand implements TurtleCommand {
    @Override
    public void transform(Turtle turtle) {
        turtle.turnRight();
        turtle.turnRight();
    }
}
