package software.reuse;

public class Task3FixedMain {
    public static void main(String[] args) {
        Shape[] shapes = { new RectShape(5, 10), new SquareShape(5) };

        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " area: " + s.area());
        }
    }
}
