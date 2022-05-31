package me.xieyi.design.patterns.decorator;

public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    public String draw() {
        return "Blue " + decoratedShape.draw();
    }
}
