import java.io.IOException;
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double maior = a;

        if (b > maior){
            maior = b;
            b = a;
        }

        if (c > maior){
            b = maior;
            maior = c;
            c = a;
        }

        if (maior >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((maior * maior) == (b * b) + (c * c)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if ((maior * maior) > (b * b) + (c * c)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((maior * maior) < (b * b) + (c * c)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (maior == b && maior == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (maior == b && maior != c || b == c && c != maior || maior == c && b != maior) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();

    }

}