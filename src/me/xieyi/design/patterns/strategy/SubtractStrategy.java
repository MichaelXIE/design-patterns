package me.xieyi.design.patterns.strategy;

public class SubtractStrategy implements Strategy {
    public int doOperation(int a, int b) {
        return a - b;
    }
}
