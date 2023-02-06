package io.github.felipelabs.DevDojoPoo.test;

import io.github.felipelabs.DevDojoPoo.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car();

        car01.name = "Model S";
        car01.model = "Hatch Sport";
        car01.age = 2022;

        car02.name = "Tesla Praid";
        car02.model = "Sport";
        car02.age = 2022;

        System.out.println(car01.name);
        System.out.println(car01.model);
        System.out.println(car01.age);
        System.out.println("--------------");
        System.out.println(car02.name);
        System.out.println(car02.model);
        System.out.println(car02.age);

    }

}
