package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionOne {
    public static void main(String[]arg){
        try{
            FileInputStream fis = new FileInputStream("/Users/net/Downloads/Section4/src/main/java/Exceptions/greetings.txt");
            Scanner scanner = new Scanner(fis);
            System.out.println(scanner.nextLine());
            scanner.close();
        } catch(FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Process complete");
        }
    }
    // /Users/net/Downloads/Section4/src/main/java/Exceptions/greetings.txt
}
