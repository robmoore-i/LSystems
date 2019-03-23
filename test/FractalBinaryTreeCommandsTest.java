import lsystem.FractalBinaryTreeCommands;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FractalBinaryTreeCommandsTest {
    @Test
    public void axiomIsJust0() {
        FractalBinaryTreeCommands fractalBinaryTreeCommands = new FractalBinaryTreeCommands(0);

        assertThat(fractalBinaryTreeCommands.toString(), equalTo("0"));
    }

    @Test
    public void canGenerateFirstRecursion() {
        FractalBinaryTreeCommands fractalBinaryTreeCommands = new FractalBinaryTreeCommands(1);

        assertThat(fractalBinaryTreeCommands.toString(), equalTo("1[0]0"));
    }

    @Test
    public void canGenerateSecondRecursion() {
        FractalBinaryTreeCommands fractalBinaryTreeCommands = new FractalBinaryTreeCommands(2);

        assertThat(fractalBinaryTreeCommands.toString(), equalTo("11[1[0]0]1[0]0"));
    }

    @Test
    public void canGenerateThirdRecursion() {
        FractalBinaryTreeCommands fractalBinaryTreeCommands = new FractalBinaryTreeCommands(3);

        assertThat(fractalBinaryTreeCommands.toString(), equalTo("1111[11[1[0]0]1[0]0]11[1[0]0]1[0]0"));
    }
}