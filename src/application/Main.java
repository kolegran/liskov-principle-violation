package application;

import rectangle.Rectangle;
import square.Square;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
	    final Rectangle rectangle = new Square();
	    rectangle.setLength(5);
	    rectangle.setWidth(10);
        assertLengthDidntChange(rectangle);
    }

    private static void assertLengthDidntChange(Rectangle rectangle) {
        final int length = rectangle.getLength();
        rectangle.setWidth(20);
        if (length != rectangle.getLength()) {
            throw new RuntimeException();
        }
    }
}
