package com.anhtester.phamvitruycap;

import java.util.ArrayList;

public class Student {

    //Private
    public String name = "Phương";
    private int age = 26;
    private String CCCD = "0123456789";

    //Protected
    protected String getName() {
        return name;
    }
    protected String getCCCD() {
        return CCCD;
    }

    //Default - không có từ khoá
    void printAge() {
        System.out.println("Age: " + age);
    }

    //Public
    public void getInfoStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + 26);
        System.out.println("CCCD: " + CCCD);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.getInfoStudent();
        System.out.println(student.getName());
        System.out.println(student.name);
    }

}
