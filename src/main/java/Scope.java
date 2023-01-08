public class Scope {
    public static void main(String[] args){

//        someFunction();
        System.out.println(calculateArea(8));
        System.out.println(calculateSquare(7));
    }
//    public static void someFunction(){
//        int apples = 5;
//        System.out.println(apples);
//        double sine = Math.sin(9);
//        System.out.println(sine);
//
//
//
//    }
    public static double calculateArea(int radius){
        double pie = 3.147;
        double area = pie * radius * radius;
        return area;

    }
    public static double calculateSquare(double side){
        double square = Math.pow(side,2);
        return square;

    }
}
/*
math build in functions
usually expect a double value
 */