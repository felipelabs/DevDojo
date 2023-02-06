package io.github.felipelabs.DevDojoIntroduction;

public class ArithmeticOperatorsBreak {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 50){
            if (count == 25){
                break;
            }
            count += 1;
            System.out.println("While: " + count);
        }

        for (int i=0; i<=50; i++){
            if (i == 26){
                break;
            }
            System.out.println("For: " + i);
        }
    }
}
