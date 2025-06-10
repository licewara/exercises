import java.util.Scanner;

public class SumOfPairs{
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int soma = 0;
    
    int n = sc.nextInt();
    
    int[] v = new int[n];
    
    for (int i = 0; i < n; i++){
        v[i] = sc.nextInt();
        if (v[i] % 2 == 0){
            soma += v[i];
        }
    }
    
    System.out.println(soma);

    sc.close();

  }
}