package com.anhtester.tinhkethua;

public class Employee extends Person {

    private String address;

    public Employee(String name, int age, float height, String address) {
        super(name, age, height);

        this.address = address;
    }

    //Ghi đè phương thức từ class Con đối với class Cha (Person)
    public void getInfo(){
        super.getInfo();
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("An", 30, 70, "Cần Thơ");
        employee.getInfo();
        //System.out.println("Address: " + employee.address);
    }

}
