import java.io.IOException;
import java.util.Scanner;

public class SecretSequence {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] vetor = new int[n];
        
        int contador = 0;
        
        for (int i = 0; i < n; i++){
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++){
          if (i == 0){
            contador++;
          } else if (vetor[i] != vetor[i-1]) {
            contador++;                
          }
        }
        
        System.out.println(contador);
        scanner.close();
    }
}