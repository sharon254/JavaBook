//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[]arg){
        double cellicous[] = {10.0,20.3,33.5,30.6};
        double fareighheight[]= Arrays.copyOf(cellicous,cellicous.length);
        System.out.println(Arrays.toString(fareighheight));
        for(int i=0;i<cellicous.length;i++){
             fareighheight[i]=cellicous[i]*1.8+32;
        };
        System.out.println( Arrays.toString(fareighheight));
        System.out.println("---------------------");
        System.out.println(Arrays.toString(cellicous));

        String menu[] = {"espresso","Iced coffee","Macchiatto"};
        menu[2] = "Tea";
        String menuString = Arrays.toString(menu);
        System.out.println(menuString);

        System.out.println(menuString);
        // Resizing an array once created
        String [] newMenu = new String[5];
        for(int i =0;i<menu.length;i++){
            // copied the two array
            newMenu[i] = menu[i];
        }
        System.out.println(Arrays.toString(newMenu));
        newMenu[3] = "Latte";
        newMenu[4] = "House Blend";
        System.out.println(Arrays.toString(newMenu));

        double[] prices = {1.99, 8.90, 3.45, 1.25};
        System.out.println(Arrays.toString(prices));
        prices[0] =2.45;
        prices[1] = 2.54;
        prices[2] = 2.34;
        prices[3] = 1.75;
        System.out.println(Arrays.toString(prices));
        Scanner scan = new Scanner(System.in);
        System.out.println("What topping do you want?");
        String[] newToppings = {scan.nextLine()};
        System.out.println(Arrays.toString(newToppings));
        // Accepting an array from users and printing it
        // Reference Trap
        int[] number = {1,2,45,65,5};
        int[] number2 = number;

        // if once array is changed it changes another
        // Do not set array variable equals to each other
        // the state of a variable shoud not change because you changed another
        // always create a new array and coy using the for loop
        int[] newNumber = new int[5];
        for (int i=0; i<number.length;i++){
            newNumber[i] = number[i];
        }
        System.out.println(Arrays.toString(newNumber));
        newNumber[1] = 8;
        System.out.println(Arrays.toString(newNumber));
        System.out.println(Arrays.toString(number));
        /**
         * Array.copyof instead of the for loop
         */
        int[] number3 = Arrays.copyOf(number,number.length);
        System.out.println(Arrays.toString(number3));
        double[] degreesCelcius = {20.3, 34.7, 12.5,45.9};
        //System.out.println(Arrays.toString(degreesCelcius));
        double[] Fahrenheit = Arrays.copyOf(degreesCelcius,degreesCelcius.length);
        for (int i=0;i<Fahrenheit.length;i++){
            Fahrenheit[i] = Fahrenheit[i]*1.8;


        }
        System.out.println(Arrays.toString(Fahrenheit));




    }
}
