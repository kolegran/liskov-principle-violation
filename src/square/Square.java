package square;

import rectangle.Rectangle;

public class Square extends Rectangle {
    private int side;

    @Override
    public int getWidth() {
        return side;
    }

    @Override
    public int getLength() {
        return side;
    }

    @Override
    public void setWidth(int side) {
        this.side = side;
    }

    @Override
    public void setLength(int side) {
        this.side = side;
    }
}
