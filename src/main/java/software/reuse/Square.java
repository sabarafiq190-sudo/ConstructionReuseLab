package software.reuse;

public class Square extends Rectangle {
    @Override
    public void setDimensions(int w, int h) {
        if (w != h) {
            throw new IllegalArgumentException("Square needs equal sides!");
        }
        super.setDimensions(w, h);
    }
}
