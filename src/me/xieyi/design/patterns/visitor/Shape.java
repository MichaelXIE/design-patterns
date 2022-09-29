package me.xieyi.design.patterns.visitor;

public interface Shape {
    String draw();

    String accept(Visitor visitor);
}
