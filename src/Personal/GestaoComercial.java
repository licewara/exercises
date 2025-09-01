package Personal;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoComercial {
    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa("Alice", 22);

        pessoa1.adicionarContato();

        System.out.println(pessoa1.toString());

    }
}

class Pessoa{

    private String nome;
    private int idade;
    private ArrayList<String> contatos = new ArrayList<String>();

    public Pessoa(String _nome, int _idade){

        this.nome = _nome;
        this.idade = _idade;

    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getContato(){

        String msg = "Contatos imprimidos com sucesso.";

        for (String i : contatos){
            System.out.println(i);
        }

        return msg;
    }

    public void setNome(String _nome){

        this.nome = _nome;

    }

    public void setIdade(int _idade){

        this.idade = _idade;

    }

    public void adicionarContato(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos contatos deseja adicionar? ");
        int numCont = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < numCont; i++){
            System.out.print("Digite o nome do " + (i+1) + " contato: ");
            String contatoAdd = scanner.nextLine();
            contatos.add(contatoAdd);
        }
    }

    @Override
    public String toString(){
        return "Pessoa{nome=" + nome + ", idade=" + idade + ", contatos=" + contatos + "}";
    }
}

class Cliente extends Pessoa{

    private String codigoCliente;
    private ArrayList<String> pedidos;

    public Cliente(String nome, int idade, String _codigoCliente){

        super(nome, idade);
        this.codigoCliente = _codigoCliente;

    }

    public void adicionarPedido(){

        Scanner scanner = new Scanner(System.in);

        int qtdPedidos = scanner.nextInt();

    }

}
