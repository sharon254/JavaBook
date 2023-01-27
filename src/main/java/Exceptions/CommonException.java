package Exceptions;

import java.util.Scanner;

public class CommonException {
        public static void main(String[] args) {

            //**************ArrayIndexOutOfBounds**************//
            int[] grades = new int[] {96, 65, 56, 86};
            System.out.println(grades[3]);

            //**************NullPointerException**************//
            String[] names = new String[7];
            names[0] = "John";
            names[1] = "Jim";
            names[2] = "Joe";
            // when referencing to a null

            for (String name : names) {
                if (name!=null){
                    System.out.println(name.toUpperCase());
                }
            }

            //**************InputMismatchException**************//
            // incase one inputs a string
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a random integer");
            if(scanner.hasNextInt()){
                scanner.nextInt();
            }
            else {
                scanner.next();
            }

            scanner.close();

        }

}
