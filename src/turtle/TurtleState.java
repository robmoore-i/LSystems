package turtle;

import coordination.Direction;
import coordination.Position;

public class TurtleState {
    public Position position;
    public Direction direction;

    public TurtleState(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }
}
