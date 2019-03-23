package lsystem.dragoncurve;

import lsystem.LSystemCommandsBuilder;

public class DragonCurveCommandsBuilder implements LSystemCommandsBuilder {
    private String string;

    public String commands(int numberOfRecursions) {
        withNumberOfRecursions(numberOfRecursions);
        return this.string;
    }

    @Override
    public String withNumberOfRecursions(int numberOfRecursions) {
        String string = "FX";

        for (int i = 0; i < numberOfRecursions; i++) {
            StringBuilder nextIteration = new StringBuilder();

            for (char c : string.toCharArray()) {
                if (c == 'X') {
                    nextIteration.append("X+YF+");
                } else if (c == 'Y') {
                    nextIteration.append("-FX-Y");
                } else {
                    nextIteration.append(c);
                }
            }

            string = nextIteration.toString();
        }

        this.string = string;
        return string.replace("X", "").replace("Y", "");
    }
}
