import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int horas, minutos, segundos, resto;

        horas = n / 3600;
        resto = n % 3600;
        minutos = resto / 60;
        resto = resto % 60;
        segundos = resto;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        scanner.close();

    }

}