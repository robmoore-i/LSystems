package lsystem;

import canvas.Canvas;
import coordination.Position;

public class DragonCurveStartingPositionCalculator implements TurtleStartingPositionCalculator {
    @Override
    public Position startingPosition(Canvas canvas) {
        return canvas.central();
    }
}