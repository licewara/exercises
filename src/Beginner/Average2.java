package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Average2 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
 
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        double avg = ((a * 2) + (b * 3) + (c * 5)) / 10;
        
        System.out.printf("MEDIA = %.1f\n", avg);
        
        scanner.close();
    }
 
}