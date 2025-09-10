package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Average3 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double avg = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;
        double exame, mediaFinal;

        System.out.printf("Media: %.1f%n", avg);
        if (avg >= 7){
            System.out.println("Aluno aprovado.");
        } else if (avg < 5){
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            exame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", exame);
            mediaFinal = (exame + avg) / 2;
            if (mediaFinal >= 5) {
                System.out.println("Aluno aprovado.");
            } else if (mediaFinal < 5) {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }

        scanner.close();

    }
}