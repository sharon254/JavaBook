import java.util.Scanner;

public class Game {
    public static void main(String[]args){

        System.out.println("Do you want to play?");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are");
        Scanner scan = new Scanner (System.in);

        // check if the user wants to play
        String userInPut = scan.nextLine();
//        String userChoice = scan.nextLine();
        String computerChoice = computerChoice();
//        System.out.println("You Chose: " + userInPut);
//        System.out.println("The computer chose: " + computerChoice);
        if(userInPut.equals("yes")){
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scan.nextLine();
            System.out.println("You Chose: " + userChoice);
            System.out.println("The computer chose: " + computerChoice);
            String result = result(userChoice,computerChoice);
            System.out.println(result);




            //if (userChoice == "Rock"){

            }
        else {
            System.out.println("Darn, some other time...!");
        }

        }
//        else {
//            System.exit(0);
//        }
//        System.out.println("\nYou chose:" + userChoice);
//        System.out.println("The computer Chose" + computerChoice);
//
//        scan.close();
//    }
    public static String computerChoice(){
        int choice = (int) (Math.random() * 3);
        System.out.println(choice);
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "scissors";
            default -> " ";
        };
    }
    public static String result(String userChoice, String computerChoice){
        String result = "";

        if (userChoice.equals("rock") && computerChoice.equals("scissors")){
            result = "you win";

        }
        else if(userChoice.equals("scissors") && computerChoice.equals("rock")){
            result = "you lose";

        }
        else if (userChoice.equals("paper") && computerChoice.equals("rock")){
            result = "you win";

        }
        else if (userChoice.equals("rock") && computerChoice.equals("paper")){
            result = "you lose";

        }
        else if (userChoice.equals("scissors") && computerChoice.equals("paper")){
            result = "you win";

        }
        else if (userChoice.equals("paper") && computerChoice.equals("scissors")){
            result = "you lose";

        }
        else if (userChoice.equals(computerChoice)){
            result = "you tie";

        }
        else {
            result = "Invalid choice";
        }



        return result;

    }
    public static void printResult(String userInPut, String computerChoice, String result){



    }

}
