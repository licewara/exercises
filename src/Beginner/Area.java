package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Area {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        final double PI = 3.14159;
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        double areaTR = (a * c) / 2;
        double raio = PI * (c*c);
        double areaTrap = ((a + b) * c)/2;
        double areaQuad = (b * b);
        double areaRet = a * b;
        
        System.out.printf("TRIANGULO: %.3f\n", areaTR);
        System.out.printf("CIRCULO: %.3f\n", raio);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrap);
        System.out.printf("QUADRADO: %.3f\n", areaQuad);
        System.out.printf("TRIANGULO: %.3f\n", areaRet);
        
        scanner.close();
 
    }
 
}