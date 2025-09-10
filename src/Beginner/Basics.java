package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Basics {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
 
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println("x = " + (a + b));


        scanner.close();
    }
 
}