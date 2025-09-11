/*
Faça um programa em Java que armazene uma matriz N x M informada pelo 
usuário.
Seu programa deve ser capaz de:
- identificar e imprimir o número de elementos pares em cada uma das linhas;
- identificar e imprimir o número de elementos ímpares em cada uma das colunas.
 */

package Beginner;


import java.util.Scanner;

public class MultiDArray001{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int linha = scanner.nextInt();
        int coluna = scanner.nextInt();
        
        int[][] matriz = new int[linha][coluna];
        
        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                
                matriz[i][j] = scanner.nextInt();
                
            }
        }
        
        int qtdPares = 0;
        
        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                
                if (matriz[i][j] % 2 == 0){
                    
                    qtdPares += 1;
                    
                }              
            }
            
            
            System.out.println("Linha " + (i+1) + ": " + qtdPares + " número(s) par(es)");

            qtdPares = 0;
        }

        int qtdImp = 0;

        for (int j = 0; j < coluna; j++){
          for (int i = 0; i < linha; i++){

            if (matriz[i][j] % 2 == 1){

              qtdImp += 1;

            }
          }
          
          System.out.println("Coluna " + (j+1) + ": " + qtdImp + " número(s) ímpar(es)");

          qtdImp = 0;
        }
        
        scanner.close();
    }
}