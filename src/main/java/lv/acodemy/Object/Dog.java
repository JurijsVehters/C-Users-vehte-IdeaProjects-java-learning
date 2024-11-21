package lv.acodemy.Object;

public class Dog extends  Animal {

    public  void bark() {
        System.out.println("Barking...");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating! Wuf-Wuf!");
    }

}
