package me.xieyi.design.patterns.decorator;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {

    @Test
    public void drawCircleShouldReturnCircle() {
        Assert.assertEquals("Circle", new Circle().draw());
    }

    @Test
    public void drawRectangleShouldReturnRectangle() {
        Assert.assertEquals("Rectangle", new Rectangle().draw());
    }

    @Test
    public void drawRedCircleShouldReturnRedCircle() {
        Assert.assertEquals("Red Circle", new RedCircle().draw());
    }

    @Test
    public void drawBlueCircleShouldReturnBlueCircle() {
        Assert.assertEquals("Blue Circle", new BlueCircle().draw());
    }

    @Test
    public void drawRedRectangleShouldReturnRedRectangle() {
        Assert.assertEquals("Red Rectangle", new RedRectangle().draw());
    }

    @Test
    public void drawRedBoldRectangleShouldReturnRedBoldRectangle() {
        Assert.assertEquals("Bold Red Rectangle", new RedBoldRectangle().draw());
    }


    @Test
    public void drawCircleByRedDecoratorShouldReturnRedCircle() {
        Assert.assertEquals("Red Circle", new RedShapeDecorator(new Circle()).draw());
    }

    @Test
    public void drawCircleByBlueDecoratorShouldReturnBlueCircle() {
        Assert.assertEquals("Blue Circle", new BlueShapeDecorator(new Circle()).draw());
    }

    @Test
    public void drawRectangleByBlueDecoratorShouldReturnBlueRectangle() {
        Assert.assertEquals("Blue Rectangle", new BlueShapeDecorator(new Rectangle()).draw());
    }

    @Test
    public void drawRectangleByRedDecoratorAndBoldDecoratorShouldReturnBoldRedRectangle() {
        Assert.assertEquals("Bold Red Rectangle", new BoldShapeDecorator(new RedShapeDecorator(new Rectangle())).draw());
    }

    @Test
    public void drawRectangleByBlueDecoratorAndBoldDecoratorShouldReturnBoldBlueRectangle() {
        Assert.assertEquals("Bold Blue Rectangle", new BoldShapeDecorator(new BlueShapeDecorator(new Rectangle())).draw());
    }

    @Test
    public void drawRectangleByBlueDecoratorAndBoldDecoratorAndSolidDecoratorShouldReturnSolidBoldBlueRectangle() {
        Assert.assertEquals("Solid Bold Blue Rectangle", new SolidShapeDecorator(new BoldShapeDecorator(new BlueShapeDecorator(new Rectangle()))).draw());
    }

}
