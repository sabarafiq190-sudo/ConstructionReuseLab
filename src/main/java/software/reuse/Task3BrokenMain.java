package software.reuse;

public class Task3BrokenMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setDimensions(5, 10);
        System.out.println("Rectangle area: " + r.area());

        Rectangle s = new Square();      // Square ko Rectangle samjha
        s.setDimensions(5, 10);          // CRASH! LSP violation
        System.out.println("Area: " + s.area());
    }
}
