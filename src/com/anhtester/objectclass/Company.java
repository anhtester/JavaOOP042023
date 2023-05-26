package com.anhtester.objectclass;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());

        //Đối tượng Annoymous - Vô danh - Không có tên đối tượng
        new Employee().getName();
        new Employee().getAddress();
    }
}
