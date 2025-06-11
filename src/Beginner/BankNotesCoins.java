import java.util.Scanner;
import java.io.IOException;

public class BankNotesCoins {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();
        int notas100, notas50, notas20, notas10, notas5, notas2, resto;
        int moeda100, moeda50, moeda25, moeda10, moeda5, moeda1;

        notas100 = (int) money / 100;
        resto = (int) money % 100;
        notas50 = resto / 50;
        resto = resto % 50;
        notas20 = resto / 20;
        resto = resto % 20;
        notas10 = resto / 10;
        resto = resto % 10;
        notas5 = resto / 5;
        resto = resto % 5;
        notas2 = resto / 2;

        double resto2 = money - ((notas100 * 100) + (notas50 * 50) + (notas20 * 20) + (notas10 * 10) + (notas5 * 5) + (notas2 * 2)) ;
        resto2 *= 100;

        moeda100 = (int) resto2 / 100;
        resto2 = (int) resto2 % 100;
        moeda50 = (int) resto2 / 50;
        resto2 = resto2 % 50;
        moeda25 = (int) resto2 / 25;
        resto2 = (int) resto2 % 25;
        moeda10 = (int) resto2 / 10;
        resto2 = (int) resto2 % 10;
        moeda5 = (int) resto2 / 5;
        resto2 = (int) resto2 % 5;
        moeda1 = (int) resto2;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS: ");
        System.out.println(moeda100 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1 + " moeda(s) de R$ 0.01");

        scanner.close();

    }

}