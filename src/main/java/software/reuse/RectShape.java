package software.reuse;

public class RectShape implements Shape {
    private final int w, h;

    public RectShape(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public int area() { return w * h; }
}
