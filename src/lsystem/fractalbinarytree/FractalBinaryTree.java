package lsystem.fractalbinarytree;

import lsystem.InterpretedLSystem;
import lsystem.LSystem;

public class FractalBinaryTree implements LSystem {
    private static final LSystem FRACTAL_BINARY_TREE = new InterpretedLSystem(
            new FractalBinaryTreeCommandsBuilder(),
            new FractalBinaryTreeCommandInterpreter(),
            new FractalBinaryTreeStartingPositionCalculator());

    public String draw(int numberOfRecursions) {
        return FRACTAL_BINARY_TREE.draw(numberOfRecursions);
    }
}
