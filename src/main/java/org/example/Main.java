package org.example;



public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        int w = add();
        System.out.println(w);
    }

    public static int add (){
        int a =10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        return c;
    }
}