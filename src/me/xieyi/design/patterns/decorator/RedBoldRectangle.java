package me.xieyi.design.patterns.decorator;

public class RedBoldRectangle extends RedRectangle {

    public String draw() {
        return "Bold " + super.draw();
    }
}
