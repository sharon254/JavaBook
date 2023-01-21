//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[]arg){
        int[][] table = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i][0]);
        }


        double [][] prices = {
                {12.99, 8.99, 9.99, 10.49, 11.99},
                {0.99, 1.99, 2.49, 1.49, 2.99},
                {8.99, 7.99, 9.49, 9.99, 10.99}
        };
        /**
         * Looping through a row
         *
         */
//        for (int i=0;i<prices[2].length;i++){
//            System.out.println((prices[2][i]));
//        }
//        for (int j=0;j<prices[1].length;j++){
//            System.out.println(prices[2][j]);
//        }
        /**
         * Create a nested loop for it
         */

        for (int i =0;i<prices.length;i++){
            switch (i){
                case 0:System.out.print("\tFruits :");break;
                case 1:System.out.print("\tVeges :");break;
                case 2:System.out.print("\tSmoothies :");break;
            }
            for (int j=0;j<prices[0].length;j++){
                System.out.print(prices[0][j]);

            }
            System.out.println("\n");
        }




//        /**


//        int a =456,b,c,d=10;b=a/d;c=a-b;
//        System.out.println(c);
        int p = 9;
        int w = 6 ;
        p = p + 1 ;
        w = w - 1 ;
        p = p + w ;if (p > w)
            System.out.println(w);

        /**
         * 7. What is the output of the following pseudo code?       int a =456,b,c,d=10;b=a/d;c=a-b;print c;
         * 411, 4
         * 411
         * 410
         * 410, 4
         * 10. A loop that never ends is referred to as a(n)_________.
         * While Loop
         * For Loop
         * Recursive Loop
         * Infinite Loop
         * 15. A graphical representation of an algorithm to solve a problem is called …………
         * Flow of data
         * Barchart
         * Histogram
         * Flowchart

         */
//        double cellicous[] = {10.0,20.3,33.5,30.6};
//        double fareighheight[]= Arrays.copyOf(cellicous,cellicous.length);
//        System.out.println(Arrays.toString(fareighheight));
//        for(int i=0;i<cellicous.length;i++){
//             fareighheight[i]=cellicous[i]*1.8+32;
//        };
//        System.out.println( Arrays.toString(fareighheight));
//        System.out.println("---------------------");
//        System.out.println(Arrays.toString(cellicous));
//
//        String menu[] = {"espresso","Iced coffee","Macchiatto"};
//        menu[2] = "Tea";
//        String menuString = Arrays.toString(menu);
//        System.out.println(menuString);
//
//        System.out.println(menuString);
//        // Resizing an array once created
//        String [] newMenu = new String[5];
//        for(int i =0;i<menu.length;i++){
//            // copied the two array
//            newMenu[i] = menu[i];
//        }
//        System.out.println(Arrays.toString(newMenu));
//        newMenu[3] = "Latte";
//        newMenu[4] = "House Blend";
//        System.out.println(Arrays.toString(newMenu));
//
//        double[] prices = {1.99, 8.90, 3.45, 1.25};
//        System.out.println(Arrays.toString(prices));
//        prices[0] =2.45;
//        prices[1] = 2.54;
//        prices[2] = 2.34;
//        prices[3] = 1.75;
//        System.out.println(Arrays.toString(prices));
//        Scanner scan = new Scanner(System.in);
//        System.out.println("What topping do you want?");
//        String[] newToppings = {scan.nextLine()};
//        System.out.println(Arrays.toString(newToppings));
//        // Accepting an array from users and printing it
//        // Reference Trap
//        int[] number = {1,2,45,65,5};
//        int[] number2 = number;
//
//        // if once array is changed it changes another
//        // Do not set array variable equals to each other
//        // the state of a variable shoud not change because you changed another
//        // always create a new array and coy using the for loop
//        int[] newNumber = new int[5];
//        for (int i=0; i<number.length;i++){
//            newNumber[i] = number[i];
//        }
//        System.out.println(Arrays.toString(newNumber));
//        newNumber[1] = 8;
//        System.out.println(Arrays.toString(newNumber));
//        System.out.println(Arrays.toString(number));
//        /**
//         * Array.copyof instead of the for loop
//         */
//        int[] number3 = Arrays.copyOf(number,number.length);
//        System.out.println(Arrays.toString(number3));
//        double[] degreesCelcius = {20.3, 34.7, 12.5,45.9};
//        //System.out.println(Arrays.toString(degreesCelcius));
//        double[] Fahrenheit = Arrays.copyOf(degreesCelcius,degreesCelcius.length);
//        for (int i=0;i<Fahrenheit.length;i++){
//            Fahrenheit[i] = Fahrenheit[i]*1.8;
//
////
////        }
////        System.out.println(Arrays.toString(Fahrenheit));
//
//        /**
//         * 2D Arrays
//         * 1.Type of data
//         * 2. 2 brackets
//         * 3.No. of rows
//         * 4.Elements in each row(columns)
//         */
//        int [][] grades =
//        {
//            {
//                72,74,78,76},
//                {
//                        82,84,88,86},
//                {
//                        92,94,98,96},
//                {
//                        62,64,68,66},
//
//        };
//        System.out.println("\tHarry :" + Arrays.toString(grades[0]));
//        System.out.println("\tMary" + Arrays.toString(grades[1]));
//        System.out.println("\tTony" + Arrays.toString(grades[2]));
//

//        int a =40;
//        int b =35;
//        int c=20;
//        int d =10;
//        System.out.println(a*b/(c-d)
//        );






    }
}
