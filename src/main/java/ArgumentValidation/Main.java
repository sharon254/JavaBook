package ArgumentValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("We are setting up your user account.");
        String username = scanner.nextLine();
        user.setUsername(scanner.nextLine());
        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
        if(username.isBlank()){
            System.out.println("Name cant be blank");
        }
        else {
            user.setUsername(scanner.nextLine());

        }


        System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");
        int age = scanner.nextInt();
        if(age>=0){
            user.setAge(scanner.nextInt());

        }

        scanner.close();
    }
}
/**
 * Argument Validation
 * Ensures that methods only receives correct arguments
 *Anticipate exceptions and write code that handles the errors
 */