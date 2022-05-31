package me.xieyi.design.patterns.decorator;

public class RedRectangle extends Rectangle {

    public static final String COLOR = "Red";

    @Override
    public String draw() {
        return COLOR + " " + super.draw();
    }
}
