package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Distance {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        final int velocidadeX = 60;
        final int velocidadeY = 90;

        int distance = scanner.nextInt();

        System.out.println((distance * 2) + " minutos");
        scanner.close();

    }

}