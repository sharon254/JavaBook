import java.util.Scanner;

public class Boolean {
    public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       int number = scan.nextInt();
        //int number=8;
       int counter =0;
       for(int i =1;i<=number;i++){
           if(number%i==0){
               counter++;
           }
       }
       if(counter==2){
           System.out.println("Is  Prime");

       }
       else{
           System.out.println("Is not prime");
       }
       // print all the prime number between 1-100
//        int i =0;
//       int num =0;


        for (int i=1;i<=100;i++){
            int counting=0;

            //System.out.println(i);
            // check if number is prime
            if(i%i==0){
                counter++;
            }
        }
        if(counter==2){


        }


       //System.out.println(counter);



        // Declaring an object
//        System.out.println("Welcome, What is your name");
//        String name =scan.next();
//        System.out.println("Welcome " + name);
//        int num1 =scan.nextInt();
//        int arrayName[] = new int[4];
        // How long is your array
        // create an array as provided by the user
        // print out the array
//        System.out.println("How many array do you want to print?");
//        int counter = scan.nextInt();
//        System.out.println(counter + counter*counter +counter*counter*counter
//        );
        // s a number that is greater than 1 and divided by 1 or itself only
        // Take input from user and check if prime
//        int number = scan.nextInt();
//        if(number>1 && number %2 !=0 ) {
//            System.out.println(number + "It is prime");
//
//        }
//        else {
//            System.out.println("Not");
//        }
//        for (int i=0;i<=20;i++) {
//            if (i%2 == 0) {
//                System.out.println(i);
//            }
//        }







    }
}
