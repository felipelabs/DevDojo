package io.github.felipelabs.DevDojoPoo.test;

import io.github.felipelabs.DevDojoPoo.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Felipe";
        person.age = 25;
        person.sex = 'M';

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.sex);
    }
}
