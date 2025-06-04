import java.util.Scanner;

public class LowestValue {
  public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    int index = 0, menor = 0;
    
    int n = sc.nextInt();
    
    int[] v = new int[n];
    
    for (int i = 0; i < n; i++){
        v[i] = sc.nextInt();
        if (i == 0){
            menor = v[i];
            index = i;
        } else if (v[i] < menor){
            menor = v[i];
            index = i;
        }
    }
    
    System.out.println("Menor: " + menor);
    System.out.println("Índice: " + index);
    
    sc.close();
    }
}
