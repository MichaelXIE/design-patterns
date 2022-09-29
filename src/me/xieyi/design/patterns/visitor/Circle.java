package me.xieyi.design.patterns.visitor;

public class Circle extends Dot {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public String draw() {
        return x + "," + y + "," + radius;
    }
}
