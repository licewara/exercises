package Beginner;

import java.util.Scanner;

public class Array001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] v = new int[n];
        
        for (int i = 0; i < n; i++){
            v[i] = sc.nextInt();
        }
        
        int c = 1;
        int max = 1;
        
        for (int i = 1; i < n; i++){
            if (v[i] > v[i-1]){
                c++;
                if (c > max){
                    max = c;
                }
            } else {
                c = 1;
            }
        }
        
        System.out.println(max);
        
        sc.close();
    }
}