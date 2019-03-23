package turtle;

public class LeafLineCommand extends TurtleCommand {
    @Override
    public void transform(Turtle turtle) {
        turtle.drawForward();
    }

    @Override
    public String toString() {
        return "turtle.LeafLineCommand{}";
    }
}
