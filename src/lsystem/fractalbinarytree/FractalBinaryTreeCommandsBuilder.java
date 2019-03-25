package lsystem.fractalbinarytree;

import lsystem.LSystemCommandsBuilder;

public class FractalBinaryTreeCommandsBuilder implements LSystemCommandsBuilder {
    @Override
    public String withNumberOfRecursions(int numberOfRecursions) {
        String string = "0";

        for (int i = 0; i < numberOfRecursions; i++) {
            StringBuilder nextIteration = new StringBuilder();

            for (char c : string.toCharArray()) {
                String str;
                if (c == '0') {
                    str = "1[0]0";
                } else if (c == '1') {
                    str = "11";
                } else {
                    str = String.valueOf(c);
                }
                nextIteration.append(str);
            }

            string = nextIteration.toString();
        }

        return string;
    }
}
