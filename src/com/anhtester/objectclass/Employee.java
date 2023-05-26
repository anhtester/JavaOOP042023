package com.anhtester.objectclass;

public class Employee {
    //Thành phần của lớp
    private String name = "Anh Tester";
    private String birthday;
    private int age;
    private String address = "Cần Thơ";

    //Khối lệnh dạng block
    //Chạy đầu tiên trong class này
    //Tự động chạy trước khi truy cập class này
    static {
        System.out.println("Load config");
    }

    //Khai báo hàm xây dựng không tham số
    public Employee(){

    }

    public Employee(String name, String address){
        this.name = name;
        this.address = address;
    }

    //Hàm xây dựng có tham số
    public Employee(String name, String birthday, int age, String address){
        this.name = name;
        this.birthday = birthday;
        this.age = age;
        this.address = address;
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
        System.out.println(employee1.getAddress());

        System.out.println("==================");
        //Khởi tạo đối tượng class với cấu trúc của hàm xây dựng KHÔNG có tham số
        Employee employee2 = new Employee();
        System.out.println(employee2.getName());
        System.out.println(employee2.getAddress());

        System.out.println("==================");
        //Khởi tạo đối tượng class với cấu trúc của hàm xây dựng CÓ tham số
        Employee employee3 = new Employee("Linh", "Hà Nội");
        System.out.println(employee3.getName());
        System.out.println(employee3.getAddress());
        System.out.println(employee3.age);
        System.out.println(employee3.birthday);

        System.out.println("==================");
        Employee employee4 = new Employee("Nguyệt", "26/05/2023", 30, "Hồ Chí Minh");
        System.out.println(employee4.getName());
        System.out.println(employee4.getAddress());
        System.out.println(employee4.age);
        System.out.println(employee4.birthday);

        Employee employee5 = new Employee("Phương", "26/05/2023", 30, "Hồ Chí Minh");

    }
}
