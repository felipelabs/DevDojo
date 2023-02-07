package io.github.felipelabs.DevDojoPoo.test;

import io.github.felipelabs.DevDojoPoo.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum();
        calculator.decrease();
        calculator.multiply(2, 3);
        calculator.sumTwoNumbers(2,2);
        System.out.println(calculator.decreaseTwo(100, 30));
    }
}
