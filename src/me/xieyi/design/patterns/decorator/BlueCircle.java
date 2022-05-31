package me.xieyi.design.patterns.decorator;

public class BlueCircle extends Circle {
    @Override
    public String draw() {
        return "Blue " + super.draw();
    }
}
