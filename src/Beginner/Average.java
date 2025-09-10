package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Average {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        
        float avg = ((a * 3.5f) + (b * 7.5f)) / 11;
        
        System.out.printf("MEDIA = %.5f\n", avg);
        
        scanner.close();
    }
 
}