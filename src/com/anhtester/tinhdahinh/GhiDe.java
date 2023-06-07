package com.anhtester.tinhdahinh;

public class GhiDe extends ActionKeyword {

    public void getInfo(){
        clickElement(); //Hàm của class con
        super.clickElement(); //Hiểu của class Cha
        setText("");
    }

    @Override
    public void clickElement() {
        System.out.println("Click on element from Child class");
    }

    public void setText(String text) {
        System.out.println("Set text from Child class");
    }

    public static void main(String[] args) {
        GhiDe ghiDe = new GhiDe();

        ghiDe.clickElement(); //Nếu class con mà có ghi đề thì lấy class con. Nếu ko có ghi đè tự hiểu của class cha
        ghiDe.setText("Selenium");
        ghiDe.scrollToElement();


    }
}
