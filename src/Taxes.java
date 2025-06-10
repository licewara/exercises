import java.io.IOException;
import java.util.Scanner;

public class Taxes {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        float salary = scanner.nextFloat();
        float tax = 0;
        float newValue = 0;
        float finalValue = 0;
        int c = 0;
        
        if (0 < salary && salary <= 2000){
            System.out.println("Isento");
        } else if (salary > 2000.1){
            newValue = salary - 2000;
            c++;
            if (newValue > 1000 && c == 1){
                tax = 0.08f;
                finalValue += 1000 * tax;
                newValue -= 1000;
                c++;
            }
            if (newValue > 1499.99 && c == 2){
                tax = 0.18f;
                finalValue += 1499.99 * tax;
                newValue -= 1499.99;
                c++;
            } 
            if (newValue > 0 && c == 3){
                tax = 0.28f;
                finalValue += newValue * tax;
            } else if (newValue > 0 && c == 2){
                tax = 0.18f;
                finalValue += newValue * tax;
            } else if (newValue > 0 && c == 3){
                tax = 0.08f;
                finalValue += newValue * tax;
            }
            System.out.printf("R$ %.2f", finalValue);

            scanner.close();
    }
  }
}