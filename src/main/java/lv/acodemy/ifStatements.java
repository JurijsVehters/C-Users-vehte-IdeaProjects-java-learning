package lv.acodemy;

import java.sql.SQLOutput;

public class ifStatements {
    public static void main(String[] args) {

        //Ever or Odd (if)


        int number = 7;
        if (number % 2 == 0) {
            System.out.println("The number is even");
        }

        // Check if number is possitive or negative (Assume is positive)

        number = 5;
        if (number >= 0) {
            System.out.println("The number is possitive.");
        } else {
            System.out.println("The numnber is negative.");
        }

        //Grade checker (if-else-if)
        //90>=A
        //75-> 89=B
        //50->74=C
        //<50=F

        //1)Create score variable:
        //2) Create logic if (score >=90) ->A
        //3) Create logic if (score >=75) ->B
        //4) Create logic if (score >=50) ->C
        //5) else -> F

        int score = 102;

        if (score >= 90) {
            System.out.println("Grade : A");
        } else if (score >= 75) {
            System.out.println("Grade : B");
        } else if (score >= 50) {
            System.out.println("Grade : C");
        } else {
            System.out.println("Grade : F");
        }

        int age = 17;
        if (age >= 18) {
            System.out.println("You can buy alckohol");
        }
        if (age < 18) {
            System.out.println("go home");
        }


        int number1 = 45;
        if (number1 % 5 == 0) {
            System.out.println("Very good");
        }


        int score1 = 32;
        if (score1 >= 50) {
            System.out.println("Passed");
        } else if (score1 < 50) {
            System.out.println("failed");
        }


        int temperature = 17;

        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 15) {
            System.out.println("Nice weather");
        } else {
            System.out.println("Its cold");
        }


        String color = "b";
        if (color.equals("green")) {
            System.out.println("GO");
        } else if (color.equals("yellow")) {
            System.out.println("slow down");
        } else if (color.equals("red")) {
            System.out.println("Stop");
            } else {
            System.out.println("wrong color");
        }











    }
}
