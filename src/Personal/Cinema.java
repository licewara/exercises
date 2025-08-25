package Personal;

public class Cinema{
    public static void main(String[] args){

        Filmes lista1 = new Filmes(2, "Grazi");
        Filmes lista2 = new Filmes(3, "Alice");

        lista1.setNomeFilme(0, "Invocação do mal 4");
        lista1.setNotaFilme(0, 8);
        lista1.setNomeFilme(1, "Halloween");
        lista1.setNotaFilme(1, 8.5);

        lista2.setNomeFilme(0, "Invocação do mal 4");
        lista2.setNotaFilme(0, 9.5);
        lista2.setNomeFilme(1, "Alien: Oitavo Passageiro");
        lista2.setNotaFilme(1, 10);
        lista2.setNomeFilme(2, "Alien Romulus");
        lista2.setNotaFilme(2, 10);

        lista1.mostrarFilmes();
        lista2.mostrarFilmes();
        System.out.println("===============================================");
    }
}

class Filmes {

    private String nomeUsuario;
    private String[] nomeFilme;
    private double[] notaFilme;

    public Filmes(int qtdFilme, String nome) {

        this.nomeUsuario = nome;
        nomeFilme = new String[qtdFilme];
        notaFilme = new double[qtdFilme];

    }

    public String getNomeFilme(int indice){
        return nomeFilme[indice];

    }

    public double getNotaFilme(int indice){
        return notaFilme[indice];
    }

    public void setNomeFilme(int indice, String nome){
        nomeFilme[indice] = nome;
    }

    public void setNotaFilme(int indice, double nota){
        notaFilme[indice] = nota;
    }

    public void mostrarFilmes(){
        int c = 0;
        System.out.println("===============================================");
        System.out.println("Usuário: " + nomeUsuario);
        for (String nomeFilme : nomeFilme){
            System.out.println("Filme assistido: " + nomeFilme);
            System.out.println("Nota do usuário: " + notaFilme[c]);
            c += 1;
        }

    }
}