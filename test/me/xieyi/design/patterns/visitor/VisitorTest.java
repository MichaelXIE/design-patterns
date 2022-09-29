package me.xieyi.design.patterns.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    @Test
    public void drawDotShouldReturnDotCoordinate() {
        Dot dot = new Dot(0, 0);
        assertEquals("0,0", dot.draw());
    }

    @Test
    public void drawCircleShouldReturnCircleCoordinateAndRadius() {
        Circle circle = new Circle(0, 0, 1);
        assertEquals("0,0,1", circle.draw());
    }

    @Test
    public void drawRectangleShouldReturnReCircleCoordinateAndWidthAndHeight() {
        Rectangle rectangle = new Rectangle(0, 0, 1, 1);
        assertEquals("0,0,1,1", rectangle.draw());
    }

}
