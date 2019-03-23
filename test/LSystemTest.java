import coordination.Arrows;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LSystemTest {
    @Test
    public void canDrawFractalTreeIteration1() {
        String input = "0";

        String fractalTree = new LSystem().drawFractalTree(input);

        assertThat(fractalTree, equalTo(" " + Arrows.NORTH + " \n"));
    }

    @Test
    public void canDrawFractalTreeIteration2() {
        String input = "1[0]0";

        String fractalTree = new LSystem().drawFractalTree(input);

        assertThat(fractalTree, equalTo(Arrows.NORTH_WEST + " " + Arrows.NORTH_EAST + "\n " + Arrows.NORTH + " \n"));
    }
}