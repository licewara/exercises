import java.io.IOException;
import java.util.Scanner;

public class Circle {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        double r = scanner.nextDouble();
        final double N = 3.14159;
        
        double A = N * (r * r);
        
        System.out.printf("A=%.4f",A);

        scanner.close();
    }
 
}
