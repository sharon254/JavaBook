import java.util.Scanner;

public class Dice {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int roll1 =rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);
        System.out.println("Enter three numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if(num1 <1 || num2 <1 || num3 <1){
            System.out.println("The numbers can not be less than 1, game is closing");
            System.exit(0);
        };
        if(num1 >6 || num2>6 || num3>6){
            System.out.println("The number is greater than 6");
            System.exit(0);

        }
        int sumOfNumbers = num1 + num2 + num3;
        int sumOfRolls = roll1 + roll2 + roll3;
        System.out.println("The dice sum is equal to: " + sumOfRolls + " Number of Sum: " + sumOfNumbers);
        if(checkWin(sumOfNumbers, sumOfRolls)){
            System.out.println("Congrats you win");
        }
        else {
            System.out.println("You lost");
        }


        scan.close();


    }
    public static int rollDice(){
        // return a decimal btn 0 and 0.9999 ,
        // multiplying by 6 brings 0 - 5.9999
        double randomNumber = Math.random() * 2;
        randomNumber += 1;
        return(int)randomNumber;


    }
    public static boolean checkWin(int sumDiceRolls , int sumOfNumbers){
        return  (sumOfNumbers > sumDiceRolls && sumOfNumbers - sumDiceRolls<3);

        }
    }

