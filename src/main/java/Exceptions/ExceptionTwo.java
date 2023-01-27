package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTwo {
    public static void main(String[] args) {
        try{
            readFile("/Users/net/Downloads/Section4/src/main/java/Exceptions/greetings.txt");
        } catch(FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Process complete");
        }


    }

    public static void readFile(String fileName) throws FileNotFoundException {
         FileInputStream fis = new FileInputStream("greetings.txt");
         Scanner scanner = new Scanner(fis);
         System.out.println(scanner.nextLine());
         scanner.close();
    }
}
