/* Criar um programa que receba o cpf e o valor da conta telefônica de várias 
pessoas. Calcule e imprima: a) a quantidade de contribuintes, b) a média 
dos valores pagos, c) o cpf do cliente que paga a menor conta e d) quantos clientes 
pagam menos de R$ 500,00. O programa deve permitir que o usuário saia quando 
quiser. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    long cpf, menorContaDono = 0;
    int contaTelefone = 0, menosQuinh = 0, menorConta = 1000000000, total = 0, media = 0, qtdContrib = 0;

    do {
        System.out.print("CPF: ");
        cpf = scanner.nextLong();
        if (cpf != -1){
            System.out.print("Valor conta: ");
            contaTelefone = scanner.nextInt();
            total += contaTelefone;
            qtdContrib++;
            if (contaTelefone < menorConta){
                menorConta = contaTelefone;
                menorContaDono = cpf;
            }
            if (contaTelefone < 500){
                menosQuinh++;
            }

        }
    } while (cpf != -1);

    media = total / qtdContrib;

    System.out.println(qtdContrib + " " + media + " " + menorContaDono + " " + menosQuinh);
    scanner.close();
    }
}
