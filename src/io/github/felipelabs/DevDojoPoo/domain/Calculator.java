package io.github.felipelabs.DevDojoPoo.domain;

public class Calculator {

    public void sum(){
        System.out.println(10 + 10);
    }
    public void decrease(){
        System.out.println(20 - 10);
    }
    public void multiply(int num, int num2){
        System.out.println(num * num2);
    }
    public void sumTwoNumbers(int a, int b){
        System.out.println(a + b);
    }
    public int decreaseTwo(int a, int b){
        if (b == 0){
            return 0;
        }
        return a - b;
    }

}
