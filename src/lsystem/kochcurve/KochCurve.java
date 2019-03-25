package lsystem.kochcurve;

import canvas.Canvas;
import lsystem.LSystem;
import turtle.Turtle;
import turtlecommands.TurtleCommand;
import turtlecommands.TurtleCommands;

public class KochCurve implements LSystem {
    @Override
    public String draw(int numberOfRecursions) {
        String input = new KochCurveCommandsBuilder().withNumberOfRecursions(numberOfRecursions);
        TurtleCommands commands = new TurtleCommands(input.toCharArray(), new KochCurveCommandInterpreter());
        Canvas canvas = new Canvas(upperBoundOfRequiredCanvasSize(commands));
        Turtle turtle = new Turtle(canvas, new KochCurveStartingPositionCalculator().startingPosition(canvas));
        for (TurtleCommand command : commands.instructions()) {
            command.executeOn(turtle);
        }

        return canvas.draw();
    }

    private int upperBoundOfRequiredCanvasSize(TurtleCommands commands) {
        return Math.max(3, commands.countMovementInstructions());
    }
}
