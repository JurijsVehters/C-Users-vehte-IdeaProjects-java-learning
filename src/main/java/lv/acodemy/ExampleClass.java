package lv.acodemy;

import java.sql.SQLOutput;

public class ExampleClass {
    public static void main(String[] args) {

        sayHello();
        greet("Jurij");
        greet("John");
        greet("Alex");


        System.out.println(add(30, 60));
        int x = add(30, 60);
        System.out.println(x);


        System.out.println(add(12.2, 13.5));

        double a = 12.2;
        double b = 13.5;
        System.out.println(add(a, b));




    }

    public static void sayHello() {
        System.out.println("Hello world");
    }


    public static void greet(String name) {
        System.out.println("Hello," + name + "!");
    }

    // Method overloading
    public static int add(int a, int b) {
        return a + b;


    }

    public static double add(double a, double b) {
        return a + b;


    }



    }



