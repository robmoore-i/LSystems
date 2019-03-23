package turtle;

import canvas.Canvas;
import coordination.Direction;
import coordination.North;
import coordination.Position;

public class Turtle {
    private Canvas canvas;
    private Position position;
    private Direction direction;
    private TurtleStateStack stateStack;

    public Turtle(Canvas canvas) {
        this.canvas = canvas;
        this.position = canvas.middleBottom();
        this.direction = new North();
        this.stateStack = new TurtleStateStack();
    }

    public void execute(TurtleCommand command) {
        command.transform(this);
    }

    public void drawForward() {
        this.position = this.position.advanceIn(this.direction);
        this.canvas.put(this.direction.arrow(), this.position);
    }

    public void pushState() {
        this.stateStack.push(this.position, this.direction);
    }

    public void turnLeft() {
        this.direction = this.direction.turnLeft();
    }

    public void popState() {
        TurtleState poppedState = this.stateStack.pop();
        this.position = poppedState.position;
        this.direction = poppedState.direction;
    }

    public void turnRight() {
        this.direction = this.direction.turnRight();
    }

    public TurtleState state() {
        return new TurtleState(this.position, this.direction);
    }

    public void drawCurrentState() {
        this.canvas.put(this.direction.arrow(), this.position);
    }
}
