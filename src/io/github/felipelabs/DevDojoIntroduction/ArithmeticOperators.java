package io.github.felipelabs.DevDojoIntroduction;

public class ArithmeticOperators {

    public static void main(String[] args) {
        // + - / *
        int numberOne = 10;
        int numberTwo = 20;

        System.out.println(numberOne + numberTwo);
        System.out.println(numberTwo - numberOne);
        System.out.println(numberTwo / numberOne);
        System.out.println(numberOne * numberTwo);

        // %
        int num = 21 % 7;
        System.out.println(num);

        // < > <= >= != ==
        boolean resultOne = 10 > 20;
        boolean resultTwo = 10 < 20;

        System.out.println(resultOne);
        System.out.println(resultTwo);

        // &&(AND) ||(OR) !(NOT)
        // = += -= /= %=
    }
}
