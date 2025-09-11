package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class InternetSearch {
  public static void main(String[] args) throws IOException {

      Scanner scanner = new Scanner(System.in);
      
      int t = scanner.nextInt();
      
      int firstLink = (t * 2) * 2;
      
      System.out.println(firstLink);

      scanner.close();
    }
 
}
