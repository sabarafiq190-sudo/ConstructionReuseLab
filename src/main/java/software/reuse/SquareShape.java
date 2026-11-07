package software.reuse;

public class SquareShape implements Shape {
    private final int side;

    public SquareShape(int side) {
        this.side = side;
    }

    @Override
    public int area() { return side * side; }
}
