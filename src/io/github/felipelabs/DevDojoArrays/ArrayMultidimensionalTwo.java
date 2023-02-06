package io.github.felipelabs.DevDojoArrays;

public class ArrayMultidimensionalTwo {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for (int[] array : arrayInt){
            System.out.println("\n-------");
            for (int num : array){
                System.out.print(num + " ");
            }
        }
    }
}
