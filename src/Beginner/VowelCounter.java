import java.util.Scanner;

public class VowelCounter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vogais = 0;
    
    int n = sc.nextInt();
    
    char[] v = new char[n];
    
    for (int i = 0; i < n; i++){
        v[i] = sc.next().charAt(0);
        char c = Character.toLowerCase(v[i]);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            vogais++;
        }
    }
    
    System.out.println(vogais + " vogais");
    
    sc.close();
    }
}