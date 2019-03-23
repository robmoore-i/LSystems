package lsystem;

public class FractalBinaryTreeCommands {
    private String string;

    public FractalBinaryTreeCommands(int i) {
        String string = "0";

        for (int j = 0; j < i; j++) {
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

        this.string = string;
    }

    @Override
    public String toString() {
        return this.string;
    }
}
