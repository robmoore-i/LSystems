package lsystem.dragoncurve;

import lsystem.InterpretedLSystem;
import lsystem.LSystem;

public class DragonCurve implements LSystem {
    public static final LSystem DRAGON_CURVE = new InterpretedLSystem(
            new DragonCurveCommandsBuilder(),
            new DragonCurveCommandInterpreter(),
            new DragonCurveStartingPositionCalculator());

    public String draw(int numberOfRecursions) {
        return DRAGON_CURVE.draw(numberOfRecursions);
    }
}
