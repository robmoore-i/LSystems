package lsystem.kochcurve;

import lsystem.LSystemCommandsBuilder;

public class KochCurveCommandsBuilder implements LSystemCommandsBuilder {
    @Override
    public String withNumberOfRecursions(int numberOfRecursions) {
        String string = "F";

        for (int i = 0; i < numberOfRecursions; i++) {
            StringBuilder nextIteration = new StringBuilder();

            for (char c : string.toCharArray()) {
                String result;
                if (c == 'F') {
                    result = "F+F-F-F+F";
                } else {
                    result = String.valueOf(c);
                }
                String str = result;
                nextIteration.append(str);
            }

            string = nextIteration.toString();
        }

        return string;
    }
}
