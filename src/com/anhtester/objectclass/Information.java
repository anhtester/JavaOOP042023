package com.anhtester.objectclass;

public class Information {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Hiền", "Hồ Chí Minh");

        Employee employee2 = new Employee("Thư", "20/10/2020", 30, "Cần Thơ");

        System.out.println(employee1.getName());
        System.out.println(employee2.getName());
    }
}
