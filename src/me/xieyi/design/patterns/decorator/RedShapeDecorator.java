package me.xieyi.design.patterns.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public String draw() {
        return "Red " + decoratedShape.draw();
    }
}
