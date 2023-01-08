public class Degrees {
    public static void main(String[] args){
        double noon = 77;          //temperature in fahrenheit.
        double evening = 61;       //temperature in fahrenheit
        double midnight = 55;
        fahrenheitToCelsius(noon);
        fahrenheitToCelsius(evening);
        fahrenheitToCelsius(midnight);




    }
    public static void fahrenheitToCelsius(double fahrenheit){
        double celsius = fahrenheit - 32 * 5/9;
        System.out.println(celsius);

    }
    public static void printCelsius(double fahrenheit ){

        System.out.println("The celsius fahrenheit are:" );



    }

}

