package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Demidov Vitaliy");
        student.setGroup(412);
        student.setEnroll(new Date());

        System.out.println("Student " + student.getName() + " from group " + student.getGroup() + " enrolled in " + student.getEnroll());
    }
}
