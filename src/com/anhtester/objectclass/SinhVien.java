package com.anhtester.objectclass;

public class SinhVien {
    private String name;
    private int age;
    private String gender;
    private String address;

    public SinhVien(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public SinhVien(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public SinhVien() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
}
