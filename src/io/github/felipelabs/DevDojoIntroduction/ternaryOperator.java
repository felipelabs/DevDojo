package io.github.felipelabs.DevDojoIntroduction;

public class ternaryOperator {
    public static void main(String[] args) {
        double salary = 3000;
        String mensageDonation = "you can donate.";
        String mensageNoDonation = "you cannot donate.";

        String result = salary > 5000 ? mensageDonation : mensageNoDonation;
        System.out.println(result);
    }
}
