package Enum;


import Enum.Model.Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        car.drive("RED");
    }

}
/**
 *  Use Enums when a variable is limited to a fixed set of variables
 *  public Enum shirtSize = {SMALL,MEDIUM,LARGE,EXTRA LARGER}
 *  use UPERCASE, UNDER_SCORE FORMAT
 */