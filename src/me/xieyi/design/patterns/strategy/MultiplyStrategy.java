package me.xieyi.design.patterns.strategy;

public class MultiplyStrategy implements Strategy {
    public int doOperation(int a, int b) {
        return a * b;
    }
}
