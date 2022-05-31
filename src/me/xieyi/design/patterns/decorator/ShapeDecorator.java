package me.xieyi.design.patterns.decorator;

public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    /**
     * @return
     */
    @Override
    public String draw() {
        return decoratedShape.draw();
    }
}
