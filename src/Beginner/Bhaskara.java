import java.io.IOException;
import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double delta = (b*b) - 4 * a * c;

        if (delta < 0 || (2 * a) == 0){
            System.out.println("Impossivel calcular");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }

        scanner.close();

    }

}