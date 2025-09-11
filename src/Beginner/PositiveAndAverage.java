package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class PositiveAndAverage {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double x5 = sc.nextDouble();
        double x6 = sc.nextDouble();

        int total = 0;
        double soma = 0;

        if (x1 > 0){
            total++;
            soma += x1;
        }
        if (x2 > 0){
            total++;
            soma += x2;
        }
        if (x3 > 0){
            total++;
            soma += x3;
        }
        if (x4 > 0){
            total++;
            soma += x4;
        }
        if (x5 > 0){
            total++;
            soma += x5;
        }
        if (x6 > 0){
            total++;
            soma += x6;
        }

        double media = soma / total;
        System.out.println(total + " valores positivos");
        System.out.printf("%.1f%n", media);

        sc.close();

    }

}