package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Salary {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
 
        int number = scanner.nextInt();    
        int hoursWorked = scanner.nextInt();
        float amountReceived = scanner.nextFloat();
        
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", (hoursWorked * amountReceived));
        
        scanner.close();
    }
 
}