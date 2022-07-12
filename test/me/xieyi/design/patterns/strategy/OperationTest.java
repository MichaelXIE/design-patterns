package me.xieyi.design.patterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class OperationTest {
    @Test
    public void operationAddShouldReturnTheSum() {
        Assert.assertEquals(2, new Operation().add(1, 1));
    }

    @Test
    public void operationSubtractShouldReturnTheDifference() {
        Assert.assertEquals(1, new Operation().subtract(2, 1));
    }

    @Test
    public void operationMultiplyShouldReturnTheProduct() {
        Assert.assertEquals(4, new Operation().multiply(2, 2));
    }

    @Test
    public void operationWithAddStrategyShouldReturnTheSum() {
        Assert.assertEquals(2, new AddStrategy().doOperation(1, 1));
    }

    @Test
    public void operationWithSubtractStrategyShouldReturnTheDifference() {
        Assert.assertEquals(2, new SubtractStrategy().doOperation(3, 1));
    }

    @Test
    public void operationWithMultiplyStrategyShouldReturnTheProduct() {
        Assert.assertEquals(6, new MultiplyStrategy().doOperation(2, 3));
    }

    @Test
    public void operationWithAddStrategyContextShouldReturnTheSum() {
        StrategyContext strategyContext = new StrategyContext(new AddStrategy());
        Assert.assertEquals(2, strategyContext.executeStrategy(1, 1));
    }

    @Test

    public void operationWithSubtractStrategyContextShouldReturnTheDifference() {
        StrategyContext strategyContext = new StrategyContext(new SubtractStrategy());
        Assert.assertEquals(2, strategyContext.executeStrategy(3, 1));
    }

    @Test
    public void operationWithMultiplyStrategyContextShouldReturnTheProduct() {
        StrategyContext strategyContext = new StrategyContext(new MultiplyStrategy());
        Assert.assertEquals(8, strategyContext.executeStrategy(2, 4));
    }

}
