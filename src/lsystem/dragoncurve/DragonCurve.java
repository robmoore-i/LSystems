package lsystem.dragoncurve;

import canvas.Canvas;
import lsystem.LSystem;
import turtle.Turtle;
import turtlecommands.TurtleCommand;
import turtlecommands.TurtleCommands;

public class DragonCurve implements LSystem {
    @Override
    public String draw(int numberOfRecursions) {
        String input = new DragonCurveCommandsBuilder().withNumberOfRecursions(numberOfRecursions);
        TurtleCommands commands = new TurtleCommands(input.toCharArray(), new DragonCurveCommandInterpreter());
        Canvas canvas = new Canvas(upperBoundOfRequiredCanvasSize(commands));
        Turtle turtle = new Turtle(canvas, new DragonCurveStartingPositionCalculator().startingPosition(canvas));
        for (TurtleCommand command : commands.instructions()) {
            command.executeOn(turtle);
        }

        return canvas.draw();
    }

    private int upperBoundOfRequiredCanvasSize(TurtleCommands commands) {
        return Math.max(3, commands.countMovementInstructions());
    }
}
