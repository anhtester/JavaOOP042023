package com.anhtester.tinhtruutuong;

abstract class Person {

    protected String ten;
    protected String cmnd;
    protected String namsinh;

    abstract public void showInfo(); //Phương thức abstract. Chỉ khai báo tên hàm. Không được phép khai báo nội dung

    abstract public void getCMND();

}
