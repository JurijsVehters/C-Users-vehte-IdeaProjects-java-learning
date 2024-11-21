package lv.acodemy;

import lv.acodemy.Object.Car;
import lv.acodemy.Object.Dog;

import java.sql.SQLOutput;
import java.util.function.DoubleFunction;

public class ObjectExample {
    public static void main(String[] args) {


        //Encapsulation (Getters, Setters)
        //Inheritance
        //Polymorphism
        //Abstraction

        //Pomogajet organizovatj programmu shto bi eje bilo proshe ponimatj


        Car audi = new Car("Q8", "Blue");
        audi.start();

        //     audi.color = "red";
        //   audi.model = "Q8";
        audi.setColor("Blue");
        audi.setModel("Q8");
        System.out.println(audi);


        Car bmw = new Car();
        //   bmw.color = "White";
        //  bmw.model = "X6";
        bmw.setColor("White");
        bmw.setModel("X6");
        bmw.start();
        System.out.println(bmw);

        System.out.println(String.format("My car model is %s, and color is: %s",  bmw.getModel(),bmw.getColor()));


        Dog theSharik = new Dog();
        theSharik.bark();
        theSharik.eat();


    }
}
