package com.anhtester.objectclass;

public class Employee {
    //Thành phần của lớp
    String name = "Anh Tester";
    String birthday;
    int age = 30;
    String address = "Cần Thơ";

    //Khối lệnh dạng block
    //Chạy đầu tiên trong class này
    static {
        System.out.println("Load config");
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        System.out.println(employee1.name);

        Employee employee2 = new Employee();
        System.out.println(employee2.address);
    }
}
