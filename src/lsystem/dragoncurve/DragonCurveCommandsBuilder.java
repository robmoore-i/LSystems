package lsystem.dragoncurve;

import lsystem.LSystemCommandsBuilder;

public class DragonCurveCommandsBuilder implements LSystemCommandsBuilder {
    private String string;

    @Override
    public String withNumberOfRecursions(int numberOfRecursions) {
        String string = "FX";

        for (int i = 0; i < numberOfRecursions; i++) {
            StringBuilder nextIteration = new StringBuilder();

            for (char c : string.toCharArray()) {
                String str;
                if (c == 'X') {
                    str = "X+YF+";
                } else if (c == 'Y') {
                    str = "-FX-Y";
                } else {
                    str = String.valueOf(c);
                }
                nextIteration.append(str);
            }

            string = nextIteration.toString();
        }

        this.string = string;
        return string.replace("X", "").replace("Y", "");
    }

    public String commands(int numberOfRecursions) {
        withNumberOfRecursions(numberOfRecursions);
        return this.string;
    }
}
