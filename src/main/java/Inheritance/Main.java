package Inheritance;

import Inheritance.Product.Shirt;

public class Main {
    public static void main(String[]args){
        Shirt shirt = new Shirt();
        shirt.setSize(Shirt.Size.SMALL);
        //shirt.setBrand(NIKE);
        shirt.setPrice(67.99);
        shirt.setBrand("NIKE");
        shirt.setColor("BLUE");
        /**
         * Favours code re-use
         * Inheritance define a parent class that serves as a foundation for child classes
         *The keyword used for inheritance - extends
         * Super Class: The class whose features are inherited
         * Sub Class: The class that inherits the other class
         */
    }
}
