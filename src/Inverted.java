import java.util.Scanner;

public class Inverted {
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    char[] v = new char[n];
    
    for (int i = n; i > 0; i--){
        v[i-1] = sc.next().charAt(0);
    }
    
    for (int i = 0; i < n-1; i++){
        System.out.print(v[i] + " ");
    }
    System.out.println(v[n-1]);
    
    
    sc.close();
  }
}
