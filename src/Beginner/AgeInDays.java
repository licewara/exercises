package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class AgeInDays {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int y, m, d, resto;

        y = n / 365;
        resto = n % 365;
        m = resto / 30;
        resto = resto % 30;
        d = resto;

        System.out.println(y + " ano (s)");
        System.out.println(m + " mes (es)");
        System.out.println(d + " dia (s)");

        scanner.close();

    }

}