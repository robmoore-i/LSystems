package lsystem;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DragonCurveCommandsTest {
    @Test
    public void axiomOfDragonCurveIsFX() {
        DragonCurveCommands dragonCurveCommands = new DragonCurveCommands(0);

        assertThat(dragonCurveCommands.commands(), equalTo("FX"));
    }

    @Test
    public void canGenerateFirstRecursionOfDragonCurve() {
        DragonCurveCommands dragonCurveCommands = new DragonCurveCommands(1);

        assertThat(dragonCurveCommands.commands(), equalTo("FX+YF+"));
    }

    @Test
    public void canGenerateSecondRecursionOfDragonCurve() {
        DragonCurveCommands dragonCurveCommands = new DragonCurveCommands(2);

        assertThat(dragonCurveCommands.commands(), equalTo("FX+YF++-FX-YF+"));
    }

    @Test
    public void stripsOutNonExecutingCommandsOnConversionToString() {
        DragonCurveCommands dragonCurveCommands = new DragonCurveCommands(2);

        assertThat(dragonCurveCommands.toString(), equalTo("F+F++-F-F+"));
    }
}