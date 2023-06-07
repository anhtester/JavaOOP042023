package com.anhtester.tinhtruutuong;

abstract class CommonPage {

    abstract public void getURL();
    abstract public void getTitle();
    abstract public void getHeaderPage();
    abstract public void getColorButton();

    public void getInfo(){
        System.out.println("Get info");
    }

}
