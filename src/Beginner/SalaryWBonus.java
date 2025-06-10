import java.io.IOException;
import java.util.Scanner;

public class SalaryWBonus {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        
        double salary = scanner.nextDouble();
        double totalSale = scanner.nextDouble();
        
        double finalSalary = salary + (totalSale * 15/100);
        
        System.out.printf("TOTAL = %.2f\n", finalSalary);
        
        
        scanner.close();
 
    }
 
}