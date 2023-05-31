package com.anhtester.tinhkethua;

public class Company extends Student{

    public Company(String name, int age, float height) {
        super(name, age, height);
    }

    public static void main(String[] args) {
        Company company = new Company("Thảo", 25, 50);
        company.getInfo();
        company.getInfoFromSinhVien();
    }
}
