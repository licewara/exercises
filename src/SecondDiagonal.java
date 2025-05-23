import java.util.Scanner;

public class SecondDiagonal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] matriz = new int[5][5];

    for (int i = 0; i < 5; i++){
      for (int j = 0; j < 5; j++){

        matriz[i][j] = scanner.nextInt();

      }
    }

    int j = 0;

    for (j = 0; j < 3; j++){
      System.out.print(matriz[0][j] + " ");
    }
    System.out.println(matriz[0][j]);

    for (j = 0; j < 2; j++){
      System.out.print(matriz[1][j] + " ");
    }
    System.out.println(matriz[1][j]);
    
    for (j = 0; j < 1; j++){
      System.out.print(matriz[2][j] + " ");
    }
    System.out.println(matriz[2][j]);

    System.out.print(matriz[3][0]);

    scanner.close();
  }
}
