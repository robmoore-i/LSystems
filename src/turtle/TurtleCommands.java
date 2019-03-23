package turtle;

import java.util.ArrayList;
import java.util.List;

public class TurtleCommands {
    private final char[] chars;
    private final List<TurtleCommand> commands;

    public TurtleCommands(char[] chars) {
        this.chars = chars;

        List<TurtleCommand> commands = new ArrayList<>();
        for (char aChar : chars) {
            commands.add(TurtleCommand.fromChar(aChar));
        }
        this.commands = commands;
    }

    public int countMovementInstructions() {
        int sum = 0;
        for (char aChar : chars) {
            if (aChar == '1' || aChar == '0') {
                sum += 1;
            }
        }
        return sum;
    }

    public Iterable<TurtleCommand> instructions() {
        return this.commands;
    }
}
