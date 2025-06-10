import java.util.Scanner;

public class AdjustPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        double[] v = new double[n];
        
        for (int i = 0; i < n; i++){
            v[i] = sc.nextDouble();
        }
        
        for (int i = 0; i < n; i++){
            if (i == (n-1)){
                System.out.printf("%.2f\n", v[i] + (v[i]*10)/100);
            } else{
                System.out.printf("%.2f ", v[i] + (v[i]*10)/100);
            }
        }
        
        sc.close();
    }
}
