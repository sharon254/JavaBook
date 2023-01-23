package Objects;

import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
    /*
     use getters to access the fields in objects
    from the car class you will create objects
     object will be of type car
     Constructor
    */

    /**
     * Mutable objects, objects with setters
     * avoid setting variables eauals to each other
     * Both variables may share same reference
     *
     */
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String[] getParts() {
        return parts;
    }

    public void setParts(String make) {
        this.parts = parts;
    }

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = parts;
    }

    public Car(Car source){
        this.make =source.make;
        this.price = source.price;
        this.year = source.year;
        this.color= source.color;
        //this.parts = source.parts;
        // to avoid reference trap we copy
        this.parts = Arrays.copyOf(parts,parts.length);


    }

    // getter is a public method return type depends on a particular fields
    // Methods
    public void drive(){
        System.out.println("\n you bought the beautiful" + this.make + "of year" + this.year);
    }





}
