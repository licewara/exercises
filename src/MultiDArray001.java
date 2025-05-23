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
        
        int qtdPares = 0, qtdImp = 0;
        
        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                
                if (matriz[i][j] % 2 == 0){
                    
                    qtdPares += 1;
                    
                } else {
                    
                    qtdImp += 1;
                    
                }
                
            }
            
            System.out.println("Linha " + (i+1) + ": " + qtdPares + " número(s) par(es)");
            
            for (int j = 0; j < coluna; j++){
             
                System.out.println("Coluna " + (j+1) + ": " + qtdImp + " número(s) ímpar(es)");
                
            }
            
            qtdPares = 0;
            qtdImp = 0;
        }
        
        scanner.close();
    }
}