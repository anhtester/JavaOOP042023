package com.anhtester.objectclass;

import java.util.ArrayList;

public class ThongTinSinhVien {
    public static void main(String[] args) {

        //Tạo 3 đối tượng sinh viên với 3 bộ thông tin khác nhau
        SinhVien sv1 = new SinhVien("Thư", 30, "Nữ", "Hà Nội");
        SinhVien sv2 = new SinhVien("Hưng", 40, "Nam", "HCM");
        SinhVien sv3 = new SinhVien("Phương", 26, "Nữ", "Bến Tre");

        //Thêm 3 đối tượng vào trong ArrayList để lưu trữ
        ArrayList<SinhVien> sinhVienArrayList = new ArrayList<>();
        sinhVienArrayList.add(sv1);
        sinhVienArrayList.add(sv2);
        sinhVienArrayList.add(sv3);

        //Duyệt ArrayList để lấy ra thông tin của từng sinh viên
        for(SinhVien sv : sinhVienArrayList){
            System.out.println("===================");
            System.out.println(sv.getName());
            System.out.println(sv.getAge());
            System.out.println(sv.getGender());
            System.out.println(sv.getAddress());
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Selenium");
        arrayList.add("Auto test");

    }
}
