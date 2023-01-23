package Objects;

import java.util.Arrays;

public class Main {
    public static void main(String[]arg){
        /**
         * Objects based on two criteria
         * 1.Contains fields
         * 2.perform tasks
         * 3.A class is a blue print from which you create an object
         */
        Car toyota = new Car("Toyota","Blue",2019, 1234.56);
        Car toyota2 = new Car(toyota);

        // we ain't creating a new object, we are just referring to the same object
        // one objct is updated with two vaiables
        /**
         * Copy constructor
         * Create a constructor that defines one parameter
         *
         */


        
        toyota.setColor("Grey");
        toyota.setPrice(toyota.getPrice()/2);
        toyota.drive();

        // with the constructor this is done in a singe
        // Constructor with 4 parameters
        // the constructor must update the objects fields
//        toyota.make = "Toyota";
//        toyota.color = "Blue";
//        toyota.price = 1234.56;
//        toyota.year = 2019;
//
//        Car mercedes = new Car("Mercedes", "Pearl", 2020, 235556);
//        mercedes.make ="Mercedes";
//        mercedes.price = 23455;
//        mercedes.color = "pearl";
//        mercedes.year = 2020;

        System.out.println("This" + toyota.getMake() + "is worth" + toyota.getPrice());
        Person sharon = new Person("Sharon", "Kenyan", "14-05-1999", new String[]{"dd,ddd,"}, 9);
        sharon.setSeatNumber(8);
//        sharon.name = "Sharon";
//        sharon.dateOfBirth = "14-05-1999";
//        sharon.nationality = "Kenyan";
//        sharon.passport = new String[]{sharon.name, sharon.nationality, sharon.dateOfBirth};
//        sharon.seatNumber = 4;
        System.out.println(sharon.getName());
        System.out.println(sharon.getNationality());
        System.out.println(sharon.getNationality());
        System.out.println(Arrays.toString(sharon.getPassport()));
        //System.out.println(Arrays.toString(sharon.passport));
        System.out.println(sharon.getSeatNumber());
        System.out.println(sharon.applyPassport());

        /**
         * You can only use shorthand initialization in the same line as the variable declaration.
         * That's because the compiler is able to infer the array type.
         * You cannot use shorthand initialization on another line because the compiler can't infer the type.
         */
        /**
         * Constructor
         * The first thing that runs when you create an object
         * to update fields
         * 1.Level of access - public
         * 2. Class name
         * 3.parameters
         * Call the constructor while creating a new car object
         * this keyword refers to current objects, to distinguish between fields and parameters
         *Getters
         * Having direct access to the fields is bad
         * hence we are to make each field private
         *Setters
         *
         *
         */
    }
}
