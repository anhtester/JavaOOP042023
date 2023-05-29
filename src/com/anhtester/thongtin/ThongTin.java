package com.anhtester.thongtin;

import com.anhtester.phamvitruycap.Student;

public class ThongTin extends Student {

    public void getInfo(){
        System.out.println(getName());
        System.out.println(getCCCD());
        //printAge();
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.getInfoStudent();

        ThongTin thongTin = new ThongTin();
        thongTin.getInfo();
    }
}
