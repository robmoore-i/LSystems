import turtle.Turtle;
import canvas.Canvas;
import turtle.TurtleCommand;
import turtle.TurtleCommands;

public class LSystem {
    public String drawFractalTree(String input) {
        // Step 1: Determine max size, create the blank canvas, initialise the turtle at middle-bottom of canvas
        char[] chars = input.toCharArray();
        TurtleCommands commands = new TurtleCommands(chars);
        int maxSize = Math.max(3, commands.countMovementInstructions());
        Canvas canvas = new Canvas(maxSize);
        Turtle turtle = new Turtle(canvas);

        // Step 2: Execute the instructions in order
        for (TurtleCommand command : commands.instructions()) {
            turtle.execute(command);
        }

        // Step 3: Get the canvas
        return canvas.draw();
    }
}
