package me.xieyi.design.patterns.visitor;

public class JsonExporter implements Visitor {
    @Override
    public String visit(Dot dot) {
        return "{'x':" + dot.getX() + ",'y':" + dot.getY() + "}";
    }

    @Override
    public String visit(Circle circle) {
        return "{'x':" + circle.getX() + ",'y':" + circle.getY() + ",'radius':" + circle.getRadius() + "}";
    }

    @Override
    public String visit(Rectangle rectangle) {
        return "{'x':" + rectangle.getX() + ",'y':" + rectangle.getY() + ",'width':" + rectangle.getWidth() + ",'height':" + rectangle.getHeight() +"}";
    }
}
