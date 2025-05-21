/*
Refaça o Exercício 2 (Maior) de modo a permitir a leitura de vários vetores 
até que o valor de N digitado seja 0.

Isto é, seu programa deve executar de forma contínua, imprimindo o resultado do 
maior número e seu respectivo índice a cada vetor.

A execução só deve ser finalizada quando o valor de N digitado for 0.
 */

import java.util.Scanner;

public class Greatest002 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int greatest = -999999, index = 0;
    int qtd = scanner.nextInt();

    while (qtd != 0){
      int[] a = new int[qtd];
      greatest = 0;
      index = 0;
      
      for (int i = 0; i < qtd; i++){
        a[i] = scanner.nextInt();

        if (greatest < a[i]){
          greatest = a[i];
          index = i;
        }
      }

      System.out.print("Maior: " + greatest + ", Índice: " + index + "\n");

      qtd = scanner.nextInt();
    }

    scanner.close();

  }
}
