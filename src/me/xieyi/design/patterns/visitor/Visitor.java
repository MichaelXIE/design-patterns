package me.xieyi.design.patterns.visitor;

public interface Visitor {
    String visit(Dot dot);

    String visit(Circle circle);

    String visit(Rectangle rectangle);
}
