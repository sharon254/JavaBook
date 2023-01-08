public class Parameters {
    public static void main(String[] args){
        calculateArea(4, 5);
        calculateArea(4, 9);
        calculateArea(7, 5);
        tipWaiter(50);

    }
    public static void calculateArea(double Length, double Width){
        double Area = Length * Width;
        System.out.println(Area);


    }
    public static void tipWaiter(double bill){
        double totalBill = 0.15 * bill  + bill;
        System.out.println(totalBill);


    }
}
// Parameter stores a value your function expects to receive
//value that you pass to a function is called an argument