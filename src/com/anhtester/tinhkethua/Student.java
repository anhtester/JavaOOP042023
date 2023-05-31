package com.anhtester.tinhkethua;

public class Student extends Person {

    public Student(String name, int age, float height) {
        super(name, age, height);
    }

//    public void layThongTin(){
//        getInfo();
//    }

    public void getInfoFromSinhVien(){
        System.out.println("Info form SinhVien class");
    }

    public static void main(String[] args) {
        Student student = new Student("Phương", 30, 50);
        student.getInfo();
    }

}
