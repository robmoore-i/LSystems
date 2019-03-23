import org.junit.Test;
import turtle.TurtleCommands;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class TurtleCommandsTest {
    @Test
    public void fractalTreeIterationTwoHasMaxSize3() {
        String input = "1[0]0";
        char[] chars = input.toCharArray();
        TurtleCommands commands = new TurtleCommands(chars);
        int maxSize = commands.countMovementInstructions();

        assertThat(maxSize, equalTo(3));
    }

    @Test
    public void canCountCommands() {
        String input = "11[1[0]0]1[0]0";
        char[] chars = input.toCharArray();
        TurtleCommands commands = new TurtleCommands(chars);
        int maxSize = commands.countMovementInstructions();

        assertThat(maxSize, equalTo(8));
    }
}