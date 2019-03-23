package canvas;

import java.util.ArrayList;

public class CanvasRows {
    private String[] rows;

    public CanvasRows(ArrayList<String> rows) {
        String[] rowsArray = new String[rows.size()];
        for (int i = 0; i < rows.size(); i++) {
            rowsArray[i] = rows.get(i);
        }
        this.rows = rowsArray;
    }

    public void write(char c, int rowIndex, int columnIndex) {
        char[] currentRow = rows[rowIndex].toCharArray();
        currentRow[columnIndex] = c;
        String newRow = new String(currentRow);
        rows[rowIndex] = newRow;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String row : rows) {
            if (row.trim().length() > 0) {
                result.append(row).append("\n");
            }
        }
        return result.toString();
    }
}
