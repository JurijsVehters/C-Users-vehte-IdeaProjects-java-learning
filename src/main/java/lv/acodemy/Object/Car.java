package lv.acodemy.Object;

public class Car {
    //Fields

    private String color;
    private String model;


    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car() {
    }

    public void start() {
        System.out.println("Car started");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    //Getters  vozrvrashajut znachenija peremenih
    //Setters - menjajut znachenija peremennih

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
