package turtle;

public abstract class TurtleCommand {
    public static TurtleCommand fromChar(char c) {
        if (c == '0') {
            return new LeafLineCommand();
        } else if (c == '1') {
            return new LineCommand();
        } else if (c == '[') {
            return new PushRecursionCommand();
        } else if (c == ']') {
            return new PopRecursionCommand();
        } else {
            throw new RuntimeException("Ya dun goofed");
        }
    }

    public abstract void transform(Turtle turtle);
}
