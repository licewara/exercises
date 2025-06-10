import java.io.IOException;
import java.util.Scanner;

public class Consumption {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        double y = scanner.nextDouble();

        System.out.printf("%.3f km/l\n", (x/y));

        scanner.close();

    }

}