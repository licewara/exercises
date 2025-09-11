package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class GameTime {

    public static void main(String[] args) throws IOException {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int i, j;

        if (start == end){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (start > end){
            for (i = 0; start < (24 + end); i++){
                start++;
            }
            System.out.println("O JOGO DUROU " + i + " HORA(S)");
        } else {
            for (j = 0; start < end; j++){
                start++;
            }
            System.out.println("O JOGO DUROU " + j + " HORA(S)");
        }

        sc.close();

    }

}