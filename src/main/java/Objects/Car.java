package Objects;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    // use getters to access the fields in objects
    //from the car class you will create objects
    // object will be of type car
    // Constructor

    public Car(String make, String color, int year, double price){
        this.price = price;
        this.make = make;
        this.year = year;
        this.color = color;


    }
    // getter is a public method return type depends on a particular fields
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;

    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color =color;

    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price =price;

    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;

    }



}
