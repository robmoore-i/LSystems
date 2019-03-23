package turtle;

import java.util.ArrayList;
import java.util.List;

public class TurtleCommands {
    private final char[] chars;
    private final List<TurtleCommand> commands;

    public TurtleCommands(char[] chars) {
        this.chars = chars;

        List<TurtleCommand> commands = new ArrayList<>();
        for (char c : chars) {
            commands.add(TurtleCommand.fromChar(c));
        }
        this.commands = commands;
    }

    public int countMovementInstructions() {
        int sum = 0;
        for (char c : chars) {
            if (c == '1' || c == '0') {
                sum += 1;
            }
        }
        return sum;
    }

    public Iterable<TurtleCommand> instructions() {
        return this.commands;
    }
}
