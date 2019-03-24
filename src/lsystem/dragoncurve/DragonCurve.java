package lsystem.dragoncurve;

import lsystem.InterpretedLSystem;
import lsystem.LSystemCommandsBuilder;
import turtle.TurtleStartingPositionCalculator;
import turtlecommands.TurtleCommandInterpreter;

public class DragonCurve extends InterpretedLSystem {
    @Override
    public LSystemCommandsBuilder lSystemCommandsBuilder() {
        return new DragonCurveCommandsBuilder();
    }

    @Override
    public TurtleCommandInterpreter turtleCommandInterpreter() {
        return new DragonCurveCommandInterpreter();
    }

    @Override
    public TurtleStartingPositionCalculator turtleStartingPositionCalculator() {
        return new DragonCurveStartingPositionCalculator();
    }
}
