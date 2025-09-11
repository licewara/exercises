/* Faça um programa que receba um número inteiro N indicando a quantidade de 
valores inteiros a serem lidos.

Caso o número seja válido, leia e armazene esses N valores em um vetor e, 
em seguida, percorra o vetor para encontrar qual o maior elemento e o índice 
(da primeira ocorrência) em que encontra-se tal elemento.

Imprima qual o maior elemento encontrado e seu índice, conforme o exemplo 
abaixo. */

package Beginner;

import java.util.Scanner;

public class Greatest {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int greatest = 0;

    int qtd = scanner.nextInt();
    
    if (qtd > 0){
      int[] a = new int[qtd];
      int index = 0;
      for (int i = 0; i < qtd; i++){
        a[i] = scanner.nextInt();

        if (greatest < a[i]){
          greatest = a[i];
          index = i;
        }

      }
      System.out.print("Maior: " + greatest + ", Índice: " + index + "\n");
    }

    
    scanner.close();
    
  }
}
