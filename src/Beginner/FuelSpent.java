import java.io.IOException;
import java.util.Scanner;

public class FuelSpent {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        final int LITERS = 12;
        int time = scanner.nextInt();
        double speed = scanner.nextInt();

        double litersSpent = (time * speed) / LITERS;

        System.out.printf("%.3f\n",litersSpent);

        scanner.close();

    }

}