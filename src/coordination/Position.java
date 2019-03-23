package coordination;

public class Position {
    public final int x;
    public final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position northward() {
        return new Position(this.x, this.y + 1);
    }

    public Position advanceIn(Direction direction) {
        return new Position(this.x + direction.dx(), this.y + direction.dy());
    }
}
