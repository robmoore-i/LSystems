package lsystem.kochcurve;

import lsystem.InterpretedLSystem;
import lsystem.LSystemCommandsBuilder;
import turtle.TurtleStartingPositionCalculator;
import turtlecommands.TurtleCommandInterpreter;

public class KochCurve extends InterpretedLSystem {
    @Override
    public TurtleStartingPositionCalculator turtleStartingPositionCalculator() {
        return new KochCurveStartingPositionCalculator();
    }

    @Override
    public TurtleCommandInterpreter turtleCommandInterpreter() {
        return new KochCurveCommandInterpreter();
    }

    @Override
    public LSystemCommandsBuilder lSystemCommandsBuilder() {
        return new KochCurveCommandsBuilder();
    }
}
