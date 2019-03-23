import coordination.Position;
import org.junit.Test;
import canvas.Canvas;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CanvasTest {
    @Test
    public void canPutXOnCanvas() {
        Canvas turtleCanvas = new Canvas(3);

        turtleCanvas.put('x', new Position(2, 0));

        String canvas = turtleCanvas.draw();
        assertThat(canvas, equalTo("  x\n"));
    }

    @Test
    public void canPutDoubleXOnCanvas() {
        Canvas turtleCanvas = new Canvas(3);

        turtleCanvas.put('x', new Position(1, 0));
        turtleCanvas.put('x', new Position(1, 1));

        String canvas = turtleCanvas.draw();
        assertThat(canvas, equalTo(" x \n x \n"));
    }
}