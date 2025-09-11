package Beginner;

import java.util.Scanner;

public class SecondDiagonal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = 5;
    int [][] matriz = new int[N][N];

    for (int i = 0; i < N; i++){
      for (int j = 0; j < N; j++){

        matriz[i][j] = scanner.nextInt();

      }
    }

    for (int i = 0; i < N; i++){
      for (int j = 0; j < N; j++){
        if (i + j < N - 1){

          System.out.print(matriz[i][j] + " ");

        }
      }
      System.out.println();
    }

    scanner.close();
    
  }
}
