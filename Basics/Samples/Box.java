package com.mycompany.box;

public class Box {
    int length;
    int breadth;
    int height;


    public static void main(String[] args){
//        Box blackbox;
        Box one=new Box();
        one.length=10;
        Box redbox=new Box();
        redbox.breadth=20;
        Box bluebox=new Box();
        bluebox.height=30;
        System.out.println(one.length);
        System.out.println(redbox.breadth);
        System.out.println(bluebox.height);
        
    }
}