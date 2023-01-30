package Inheritance.Product;

public class Shirt extends Product{
    private double price;
    private Shirt.Size size;

    public enum Size {SMALL, MEDIUM, LARGE}

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
