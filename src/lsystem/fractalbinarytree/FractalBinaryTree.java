package lsystem.fractalbinarytree;

import lsystem.InterpretedLSystem;
import lsystem.LSystemCommandsBuilder;
import turtle.TurtleStartingPositionCalculator;
import turtlecommands.TurtleCommandInterpreter;

public class FractalBinaryTree extends InterpretedLSystem {
    @Override
    public LSystemCommandsBuilder lSystemCommandsBuilder() {
        return new FractalBinaryTreeCommandsBuilder();
    }

    @Override
    public TurtleCommandInterpreter turtleCommandInterpreter() {
        return new FractalBinaryTreeCommandInterpreter();
    }

    @Override
    public TurtleStartingPositionCalculator turtleStartingPositionCalculator() {
        return new FractalBinaryTreeStartingPositionCalculator();
    }
}
