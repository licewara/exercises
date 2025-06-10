import java.io.IOException;
import java.util.Scanner;

public class Sphere {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        double r = scanner.nextInt();
        final double PI = 3.14159;
        
        double volume = (4/3.0) * PI * (r*r*r);
        
        System.out.printf("VOLUME = %.3f\n", volume);
        
        scanner.close();
    }
}