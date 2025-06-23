import java.io.IOException;
import java.util.Scanner;

public class Snack {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double price;

        int foodCode = sc.nextInt();
        int quantity = sc.nextInt();

        if (foodCode == 1){
            price = 4;
            System.out.printf("Total: R$ %.2f%n", (price*quantity));
        } else if (foodCode == 2){
            price = 4.50;
            System.out.printf("Total: R$ %.2f%n", (price*quantity));
        } else if (foodCode == 3){
            price = 5.00;
            System.out.printf("Total: R$ %.2f%n", (price*quantity));
        } else if (foodCode == 4){
            price = 2.00;
            System.out.printf("Total: R$ %.2f%n", (price*quantity));
        } else if (foodCode == 5){
            price = 1.50;
            System.out.printf("Total: R$ %.2f%n", (price*quantity));
        }

        sc.close();


    }

}