package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Prod {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int prod = a * b;
        
        System.out.println("PROD = " + prod);
        
        scanner.close();
 
    }
 
}