import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LSystemTest {
    @Test
    public void canDrawFractalTreeIteration1() {
        String input = "0";

        String fractalTree = new LSystem().drawFractalTree(input);

        assertThat(fractalTree, equalTo(Arrows.NORTH));
    }
}