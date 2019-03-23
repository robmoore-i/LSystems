package lsystem;

import canvas.Canvas;
import coordination.Position;

public class FractalBinaryTreeStartingPositionCalculator implements TurtleStartingPositionCalculator {
    @Override
    public Position startingPosition(Canvas canvas) {
        return canvas.middleBottom();
    }
}
