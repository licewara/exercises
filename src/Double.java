/* Escreva um programa que leia 10 valores inteiros, armazene-os em um vetor, 
e depois os imprima dobrados, isto é, multiplicados por 2.

Siga o padrões de entrada e saída do exemplo abaixo. */

import java.util.Scanner;

public class Double{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int[] vetor = new int[10];

    for (int i = 0; i < 10; i++){
      int num = scanner.nextInt();
      vetor[i] = num;
    }

    int c = 0;

    for (int obj : vetor){
      c++;
      if (c == 10){
        System.out.println(obj*2);
      } else{
        System.out.print(obj*2 + " ");
      }
    }

    scanner.close();

  }
}