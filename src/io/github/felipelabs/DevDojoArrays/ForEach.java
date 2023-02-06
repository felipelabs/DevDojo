package io.github.felipelabs.DevDojoArrays;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbersTwo = new int[]{1, 2, 3, 4, 5};

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
