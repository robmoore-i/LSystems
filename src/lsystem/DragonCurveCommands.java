package lsystem;

public class DragonCurveCommands {
    private final String string;

    public DragonCurveCommands(int i) {
        String string = "FX";

        for (int j = 0; j < i; j++) {
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
    }

    @Override
    public String toString() {
        return this.string.replace("X", "").replace("Y", "");
    }

    public String commands() {
        return this.string;
    }
}
