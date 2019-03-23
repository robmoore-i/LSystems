package canvas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CanvasRows {
    private String[] rows;
    private int rowLength;

    public CanvasRows(ArrayList<String> rows) {
        this.rows = toArray(rows);
        this.rowLength = rows.get(0).length();
    }

    private String[] toArray(ArrayList<String> rows) {
        String[] rowsArray = new String[rows.size()];
        for (int i = 0; i < rows.size(); i++) {
            rowsArray[i] = rows.get(i);
        }
        return rowsArray;
    }

    public void write(char c, int rowIndex, int columnIndex) {
        char[] currentRow = rows[rowIndex].toCharArray();
        currentRow[columnIndex] = c;
        String newRow = new String(currentRow);
        rows[rowIndex] = newRow;
    }

    @Override
    public String toString() {
        ArrayList<String> rows = new ArrayList<>();
        for (String row : this.rows) {
            if (row.trim().length() > 0) {
                rows.add(row);
            }
        }
        String[] nonEmptyRows = toArray(rows);

        int earliestColumnIndex = Arrays.stream(nonEmptyRows)
                .map(row -> {
                    for (int i = 0; i < row.length(); i++) {
                        if (row.charAt(i) != ' ') {
                            return i;
                        }
                    }
                    throw new RuntimeException("Unexpectedly empty row");
                })
                .min(Comparator.comparingInt(i -> i))
                .get();

        int latestColumnIndex = Arrays.stream(nonEmptyRows)
                .map(row -> {
                    for (int i = row.length() - 1; i >= 0; i--) {
                        if (row.charAt(i) != ' ') {
                            return i;
                        }
                    }
                    throw new RuntimeException("Unexpectedly empty row");
                })
                .max(Comparator.comparingInt(i -> i))
                .get();

        ArrayList<String> trimmedRows = new ArrayList<>();
        for (String row : rows) {
            trimmedRows.add(row.substring(earliestColumnIndex, latestColumnIndex + 1));
        }

        StringBuilder result = new StringBuilder();
        for (String row : trimmedRows) {
            result.append(row).append("\n");
        }

        return result.toString();
    }
}
