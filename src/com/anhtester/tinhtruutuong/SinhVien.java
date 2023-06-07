package com.anhtester.tinhtruutuong;

public class SinhVien extends Person {

    @Override
    public void showInfo() {
        System.out.println("Nguyễn Văn A");
    }

    @Override
    public void getCMND() {
        System.out.println("");
    }

    //Cho biết hàm này BUỘC phải Ghi đè giống với tên hàm ở class Person
    public void getCCCD() {

    }
}
