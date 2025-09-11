/*You must make a program that read a float-point number and print a message saying in which of following intervals the
number belongs: [0,25] (25,50], (50,75], (75,100]. If the read number is less than zero or greater than 100, the
program must print the message “Fora de intervalo” that means "Out of Interval".


The symbol '(' represents greater than. For example:
        [0,25] indicates numbers between 0 and 25.0000, including both.
        (25,50] indicates numbers greater than 25 (25.00001) up to 50.0000000. */
package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Interval {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        if (0 <= n && n <= 25){
            System.out.println("Intervalo (0, 25]");
        } else if (25.01 <= n && n <= 50){
            System.out.println("Intervalo (25, 50]");
        } else if (50.01 <= n && n <= 75){
            System.out.println("Intervalo (50, 75]");
        } else if (75.01 <= n && n <= 100){
            System.out.println("Intervalo (75, 100]");
        } else{
            System.out.println("Fora de intervalo");
        }

        sc.close();

    }

}

