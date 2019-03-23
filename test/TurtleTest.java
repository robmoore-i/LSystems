import canvas.Canvas;
import coordination.Arrows;
import coordination.North;
import lsystem.FractalBinaryTreeStartingPositionCalculator;
import org.junit.Test;
import turtle.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TurtleTest {
    @Test
    public void startsMiddleBottomOfCanvasFacingNorthForMaxSize5() {
        Canvas canvas = new Canvas(5);
        Turtle turtle = new Turtle(canvas, new FractalBinaryTreeStartingPositionCalculator());

        TurtleState state = turtle.state();
        assertThat(state.position.x, equalTo(2));
        assertThat(state.position.y, equalTo(0));
        assertThat(state.direction, equalTo(new North()));
    }

    @Test
    public void startsMiddleBottomOfCanvasFacingNorthForMaxSize3() {
        Canvas canvas = new Canvas(3);
        Turtle turtle = new Turtle(canvas, new FractalBinaryTreeStartingPositionCalculator());

        TurtleState state = turtle.state();
        assertThat(state.position.x, equalTo(1));
        assertThat(state.position.y, equalTo(0));
        assertThat(state.direction, equalTo(new North()));
    }

    @Test
    public void executingLineCommandDrawsForwardsOnTheCanvas() {
        Canvas turtleCanvas = new Canvas(3);
        Turtle turtle = new Turtle(turtleCanvas, new FractalBinaryTreeStartingPositionCalculator());
        turtle.execute(new LineCommand());

        String canvas = turtleCanvas.draw();
        assertThat(canvas, equalTo(" " + Arrows.NORTH + " \n"));
    }

    @Test
    public void executingPushRecursionCommandTurnsLeft() {
        Canvas turtleCanvas = new Canvas(3);
        Turtle turtle = new Turtle(turtleCanvas, new FractalBinaryTreeStartingPositionCalculator());
        turtle.execute(new PushRecursionCommand());
        turtle.execute(new LineCommand());

        String canvas = turtleCanvas.draw();
        assertThat(canvas, equalTo(Arrows.NORTH_WEST + "  \n " + Arrows.NORTH + " \n"));
    }

    @Test
    public void executingPushAndPopCommandsRecursesTheTurtlePosition() {
        Canvas turtleCanvas = new Canvas(3);
        Turtle turtle = new Turtle(turtleCanvas, new FractalBinaryTreeStartingPositionCalculator());
        turtle.execute(new PushRecursionCommand());
        turtle.execute(new LineCommand());
        turtle.execute(new PopRecursionCommand());
        turtle.execute(new LineCommand());

        String canvas = turtleCanvas.draw();
        assertThat(canvas, equalTo(Arrows.NORTH_WEST + " " + Arrows.NORTH_EAST + "\n " + Arrows.NORTH + " \n"));
    }
}