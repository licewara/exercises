import java.io.IOException;
import java.util.Scanner;

public class Greatest003{
    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = scanner.nextInt();

        int maior = a;
        if (b > maior){
            maior = b;
        }
        if (s > maior){
            maior = s;
        }

        System.out.println(maior + " eh o maior");


        scanner.close();

    }
}