package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class SimpleCalculate {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        int codeFirst = scanner.nextInt();
        int quantityFirst = scanner.nextInt();
        double priceFirst = scanner.nextDouble();
        
        int codeSecond = scanner.nextInt();
        int quantitySecond = scanner.nextInt();
        double priceSecond = scanner.nextDouble();
        
        double total = (quantityFirst * priceFirst) + (quantitySecond * priceSecond);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        
        scanner.close();
 
    }
 
}