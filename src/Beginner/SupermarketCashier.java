package Beginner;

import java.util.Scanner;
import java.util.ArrayList;

public class SupermarketCashier{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> itemName = new ArrayList<String>();
        int itemCode, amount = 0, totalAmount = 0;
        double totalPrice = 0, price = 0;

        do{
            System.out.print("What is the item code? ");
            itemCode = scanner.nextInt();
            if (itemCode > 0){
                scanner.nextLine();
                System.out.print("What is the item name? ");
                itemName.add(scanner.nextLine());

                System.out.print("What is the item price? ");
                price = scanner.nextDouble();

                System.out.print("How many do you want? ");
                amount = scanner.nextInt();
                totalAmount += amount;
                totalPrice += (price * amount);
            }
        } while (itemCode > 0);
        
        int c = 0;

        for (String i : itemName){
            if (c == itemName.size() - 1){
                System.out.print(i);
            } else {
                System.out.print(i + " + ");
            }
            c++;
        }

        System.out.print(" = ");
        System.out.printf("R$%.2f (%d items in total)\n", totalPrice, totalAmount);

        scanner.close();

    }
}