package com.anhtester.tinhkethua;

public class Person {
    public String name;
    public int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void getInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);

    }

    public static void main(String[] args) {
        Person person = new Person("Hưng", 40, 70);

//        Student student = new Student("Hưng", 40, 70);
//        student.getInfoFromSinhVien();
    }
}
