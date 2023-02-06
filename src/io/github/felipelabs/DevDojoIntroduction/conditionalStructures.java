package io.github.felipelabs.DevDojoIntroduction;

public class conditionalStructures {

    public static void main(String[] args) {

        int age = 20;

        if(age >= 18){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (age < 18){
            System.out.println("welcome.");
        } else if (age >= 18 && age <= 20) {
            System.out.println("Excuse me.");
        } else{
            System.out.println("Congratualations.");
        }
    }
}
