package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class SimpleSort {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int menor = x, medio = 0, maior = 0;

        if (x < y && x > z || x > y && x < z){
            medio = x;
        } else if (x > y && x > z){
            maior = x;
        }

        if (y < x && y < z){
            menor = y;
        } else if (y > x && y < z || y < x && y > z){
            medio = y;
        } else if (y > x && y > z){
            maior = y;
        }

        if (z < x && z < y){
            menor = z;
        } else if (z > x && z < y || z < x && z > y){
            medio = z;
        } else if (z > x && z > y){
            maior = z;
        }

        System.out.println(menor);
        System.out.println(medio);
        System.out.println(maior + "\n");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}