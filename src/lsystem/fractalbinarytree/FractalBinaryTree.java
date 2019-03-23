package lsystem.fractalbinarytree;

import canvas.Canvas;
import lsystem.LSystem;
import turtle.Turtle;
import turtlecommands.TurtleCommand;
import turtlecommands.TurtleCommands;

public class FractalBinaryTree implements LSystem {
    public String draw(int numberOfRecursions) {
        String input = new FractalBinaryTreeCommands(numberOfRecursions).toString();
        TurtleCommands commands = new TurtleCommands(input.toCharArray(), new FractalBinaryTreeCommandInterpreter());
        int maxSize = maxCanvasSize(commands);

        Canvas canvas = new Canvas(maxSize);
        Turtle turtle = new Turtle(canvas, new FractalBinaryTreeStartingPositionCalculator());
        for (TurtleCommand command : commands.instructions()) {
            turtle.execute(command);
        }

        return canvas.draw();
    }

    private int maxCanvasSize(TurtleCommands commands) {
        return Math.max(3, commands.countMovementInstructions());
    }
}
