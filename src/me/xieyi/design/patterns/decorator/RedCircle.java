package me.xieyi.design.patterns.decorator;

public class RedCircle extends Circle {

    /**
     * @return
     */
    @Override
    public String draw() {
        return "Red " + super.draw();
    }
}
