package lsystem;

import turtle.TurtleCommand;

public interface TurtleCommandInterpreter {
    TurtleCommand fromChar(char c);

    boolean isMovementCommand(char c);
}
