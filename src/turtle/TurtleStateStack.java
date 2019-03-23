package turtle;

import coordination.Direction;
import coordination.Position;

import java.util.Stack;

public class TurtleStateStack {
    private final Stack<TurtleState> turtleStates = new Stack<>();

    public void push(Position position, Direction direction) {
        TurtleState turtleState = new TurtleState(position, direction);
        this.turtleStates.push(turtleState);
    }

    public TurtleState pop() {
        return this.turtleStates.pop();
    }
}
