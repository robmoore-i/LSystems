package lsystem.dragoncurve;

import canvas.Canvas;
import lsystem.LSystem;
import turtle.Turtle;
import turtlecommands.TurtleCommand;
import turtlecommands.TurtleCommands;

public class DragonCurve implements LSystem {
    public String draw(int numberOfRecursions) {
        String input = new DragonCurveCommands(numberOfRecursions).toString();
        TurtleCommands commands = new TurtleCommands(input.toCharArray(), new DragonCurveCommandInterpreter());
        int maxSize = maxCanvasSize(commands);

        Canvas canvas = new Canvas(maxSize);
        Turtle turtle = new Turtle(canvas, new DragonCurveStartingPositionCalculator());
        for (TurtleCommand command : commands.instructions()) {
            turtle.execute(command);
        }

        return canvas.draw();
    }

    private int maxCanvasSize(TurtleCommands commands) {
        return Math.max(3, commands.countMovementInstructions());
    }
}
