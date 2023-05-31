package com.anhtester.tinhdonggoi;

public class Information {

    public void TC01(){
        Student student = new Student("Thành", 30, "Hà Nội");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
    }

    public void TC02(){
        Student student = new Student("Hương", 20, "Đà Nẵng");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
    }

    public static void main(String[] args) {

        Student student = new Student("Phúc", 30, "Hà Nội");
        System.out.println(student.getName());

        student.setName("Hân");
        System.out.println(student.getName());

        Information information = new Information();

        System.out.println("================");
        information.TC01();
        System.out.println("================");
        information.TC02();
    }

}
