package me.xieyi.design.patterns.decorator;

public class SolidShapeDecorator extends ShapeDecorator {

    public SolidShapeDecorator(Shape shape) {
        super(shape);
    }

    public String draw() {
        return "Solid " + decoratedShape.draw();
    }
}
