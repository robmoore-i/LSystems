package lsystem;

import canvas.Canvas;
import turtle.Turtle;
import turtle.TurtleStartingPositionCalculator;
import turtlecommands.TurtleCommand;
import turtlecommands.TurtleCommandInterpreter;
import turtlecommands.TurtleCommands;

public abstract class InterpretedLSystem implements LSystem {
    public abstract TurtleStartingPositionCalculator turtleStartingPositionCalculator();

    public abstract TurtleCommandInterpreter turtleCommandInterpreter();

    public abstract LSystemCommandsBuilder lSystemCommandsBuilder();

    @Override
    public String draw(int numberOfRecursions) {
        String input = lSystemCommandsBuilder().withNumberOfRecursions(numberOfRecursions);
        TurtleCommands commands = new TurtleCommands(input.toCharArray(), turtleCommandInterpreter());
        int maxSize = maxCanvasSize(commands);

        Canvas canvas = new Canvas(maxSize);
        Turtle turtle = new Turtle(canvas, turtleStartingPositionCalculator());
        for (TurtleCommand command : commands.instructions()) {
            turtle.execute(command);
        }

        return canvas.draw();
    }

    private int maxCanvasSize(TurtleCommands commands) {
        return Math.max(3, commands.countMovementInstructions());
    }
}
