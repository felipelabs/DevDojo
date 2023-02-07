package io.github.felipelabs.DevDojoPoo.test;

import io.github.felipelabs.DevDojoPoo.domain.Student;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Felipe";
        student.age = 25;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
