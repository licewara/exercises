package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Distance {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();

        System.out.println((distance * 2) + " minutos");
        scanner.close();

    }

}