package io.github.felipelabs.DevDojoIntroduction;

public class ArithmeticOperatorsDoWhileFor {
    public static void main(String[] args) {
        // while, do while, for

        int count = 0;
        while (count <= 10){
            System.out.println(count);
            count += 1;
        }

        count = 0;
        do {
            System.out.println(count);
            count += 1;
        } while (count <= 10);

        for (int i=0; i<10; i++){
            System.out.println("For: " + i);
        }
    }
}
