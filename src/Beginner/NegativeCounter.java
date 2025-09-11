package Beginner;

import java.util.Scanner;

public class NegativeCounter {
  public static void main(String[] args) {       
    Scanner sc = new Scanner(System.in);
    int c = 0;
    
    int n = sc.nextInt();
    
    int[] v = new int[n];
    
    for (int i = 0; i < n; i++){
        v[i] = sc.nextInt();
        if (v[i] < 0){
            c++;
        }
    }
    
    System.out.println(c);

    sc.close();
    }
}