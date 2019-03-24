package canvas;

import coordination.Position;

import java.util.ArrayList;

public class Canvas {
    private final CanvasRows rows;
    private final int maxSize;
    private final int maxIndex;

    public Canvas(int maxSize) {
        this.maxSize = maxSize;

        StringBuilder rowBuilder = new StringBuilder();
        for (int i = 0; i < maxSize; i++) {
            rowBuilder.append(" ");
        }
        String emptyRow = rowBuilder.toString();

        ArrayList<String> rows = new ArrayList<>();
        for (int i = 0; i < maxSize; i++) {
            rows.add(emptyRow);
        }

        this.rows = new CanvasRows(rows);
        this.maxIndex = maxSize - 1;
    }

    public String draw() {
        return this.rows.toString();
    }

    public void put(char c, Position position) {
        int row = maxIndex - position.y;
        int column = position.x;
        this.rows.write(c, row, column);
    }

    public Position middleBottom() {
        return new Position(maxSize / 2, 0);
    }

    public Position central() {
        return new Position(maxSize / 2, maxSize / 2);
    }

    public Position bottomRight() {
        return new Position(maxIndex, 0);
    }
}
