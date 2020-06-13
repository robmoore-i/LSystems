package turtle;

import coordination.Direction;
import coordination.Position;

public class TurtleState {
    public final Position position;
    public final Direction direction;

    public TurtleState(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }
}
