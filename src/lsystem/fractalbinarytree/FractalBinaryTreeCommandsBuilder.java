package lsystem.fractalbinarytree;

import lsystem.LSystemCommandsBuilder;

public class FractalBinaryTreeCommandsBuilder implements LSystemCommandsBuilder {
    @Override
    public String withNumberOfRecursions(int numberOfRecursions) {
        String string = "0";

        for (int i = 0; i < numberOfRecursions; i++) {
            StringBuilder nextIteration = new StringBuilder();

            for (char c : string.toCharArray()) {
                if (c == '0') {
                    nextIteration.append("1[0]0");
                } else if (c == '1') {
                    nextIteration.append("11");
                } else {
                    nextIteration.append(c);
                }
            }

            string = nextIteration.toString();
        }

        return string;
    }
}
