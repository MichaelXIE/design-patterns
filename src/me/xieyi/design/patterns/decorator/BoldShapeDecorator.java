package me.xieyi.design.patterns.decorator;

public class BoldShapeDecorator extends ShapeDecorator {

    public BoldShapeDecorator(Shape shape) {
        super(shape);
    }

    public String draw() {
        return "Bold " + decoratedShape.draw();
    }
}
