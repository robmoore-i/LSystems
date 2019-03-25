package lsystem.fractalbinarytree;

import canvas.Canvas;
import lsystem.LSystem;
import turtle.Turtle;
import turtlecommands.TurtleCommand;
import turtlecommands.TurtleCommands;

public class FractalBinaryTree implements LSystem {
    @Override
    public String draw(int numberOfRecursions) {
        String input = new FractalBinaryTreeCommandsBuilder().withNumberOfRecursions(numberOfRecursions);
        TurtleCommands commands = new TurtleCommands(input.toCharArray(), new FractalBinaryTreeCommandInterpreter());
        Canvas canvas = new Canvas(upperBoundOfRequiredCanvasSize(commands));
        Turtle turtle = new Turtle(canvas, new FractalBinaryTreeStartingPositionCalculator().startingPosition(canvas));
        for (TurtleCommand command : commands.instructions()) {
            command.executeOn(turtle);
        }

        return canvas.draw();
    }

    private int upperBoundOfRequiredCanvasSize(TurtleCommands commands) {
        return Math.max(3, commands.countMovementInstructions());
    }
}