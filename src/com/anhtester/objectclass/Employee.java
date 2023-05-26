package com.anhtester.objectclass;

public class Employee {
    //Thành phần của lớp
    private String name = "Anh Tester";
    private String birthday;
    private int age = 30;
    private String address = "Cần Thơ";

    //Khối lệnh dạng block
    //Chạy đầu tiên trong class này
    //Tự động chạy trước khi truy cập class này
    static {
        System.out.println("Load config");
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public static void main(String[] args) {

        //Khai báo Class và Object
        Employee employee1 = new Employee();
        System.out.println(employee1.getName());

        Employee employee2 = new Employee();
        System.out.println(employee2.getAddress());
    }
}
