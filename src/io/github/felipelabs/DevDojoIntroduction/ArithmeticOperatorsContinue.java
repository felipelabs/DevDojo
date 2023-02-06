package io.github.felipelabs.DevDojoIntroduction;

public class ArithmeticOperatorsContinue {
    public static void main(String[] args) {
        int count = 50;

        for (int i=0;count >= i;count--){
            if (count == 25){
                continue;
            }
            System.out.println(count);
        }
    }
}
