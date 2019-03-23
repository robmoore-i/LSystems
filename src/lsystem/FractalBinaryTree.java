package lsystem;

import canvas.Canvas;
import turtle.Turtle;
import turtle.TurtleCommand;
import turtle.TurtleCommands;

public class FractalBinaryTree implements LSystem {
    public String draw(int numberOfRecursions) {
        String input = new FractalBinaryTreeCommands(numberOfRecursions).toString();
        TurtleCommands commands = new TurtleCommands(input.toCharArray());
        int maxSize = maxCanvasSize(commands);

        Canvas canvas = new Canvas(maxSize);
        Turtle turtle = new Turtle(canvas);
        for (TurtleCommand command : commands.instructions()) {
            turtle.execute(command);
        }

        return canvas.draw();
    }

    private int maxCanvasSize(TurtleCommands commands) {
        return Math.max(3, commands.countMovementInstructions());
    }
}
