import java.util.Scanner;

public class WhileLoop {
    public static void main(String[]args){
        // keep running as long as a condition is true
//        int numberT = 25;
//        while(numberT <= 30){
//            System.out.println(numberT);
//            numberT++;
//        }
//        for(int number =25; number <= 30;number ++){
//            System.out.println("Welcome!");
//        }
        System.out.println("You have three guesses start now");

        int min = 1;
        int max = 9;
        int guessedNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int numberOfTrials;
        for(numberOfTrials=0;numberOfTrials<=2;numberOfTrials++){
            Scanner scan = new Scanner(System.in);
            int usersNumber = scan.nextInt();
            while (guessedNumber == usersNumber ){
                System.exit(0);
                //System.out.println("Correct Guess");
            }
            System.out.println("Almost");
            System.out.println(guessedNumber);

        }







    }
}
