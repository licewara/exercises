import java.io.IOException;
import java.util.Scanner;

public class Tire {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        if (n >= m){
            System.out.println(n - m);
        } else if (n < m){
            System.out.println(m-n);
        }
        
        scanner.close();
    }
 
}