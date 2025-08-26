package Personal;

import java.util.ArrayList;

public class Cinema2 {
    public static void main(String[] args) {

        Filme usuario1 = new Filme("Alice", "Invocação do Mal 4", 8.5);
        Filme usuario2 = new Filme("Pedro", "A Freira 2", 6.5);

        usuario1.setFilme("Alien: O Oitavo Passageiro", 9.898);
        usuario1.setFilme("O Massacre da Serra Elétrica", 7.2);
        usuario1.setFilme("Pearl", 8.3);
        usuario1.setFilme("Scream", 9.5);
        usuario1.setFilme("Corra!", 10);

        usuario2.setFilme("Terrifier 3", 5.5);
        usuario2.setFilme("Nós", 8.8);

        usuario1.mostrarFilmes();
        usuario2.mostrarFilmes();

        usuario1.removerFilmes("Invocação do Mal 4");
        usuario1.removerFilmes("O Massacre da Serra Elétric");

        usuario1.mostrarFilmes();

        usuario1.limparFilmes();
        usuario1.mostrarFilmes();

    }
}

class Filme{

    private final String nomeUsuario;
    private final ArrayList<String> nomeFilmes = new ArrayList<>();
    private final ArrayList<Double> notaFilmes = new ArrayList<>();

    public Filme(String nomeUsuario, String nomeFilme, double notaFilme){

        this.nomeUsuario = nomeUsuario;
        nomeFilmes.add(nomeFilme);
        notaFilmes.add(notaFilme);

    }

    public void setFilme(String nomeFilme, double notaFilme){

        nomeFilmes.add(nomeFilme);
        notaFilmes.add(notaFilme);

    }

    public void mostrarFilmes(){
        int c = 0;

        System.out.println("=============================");
        System.out.println("Avaliações de " + nomeUsuario + ".");
        for (String filme : nomeFilmes){
            System.out.println("Filme: " + filme);
            System.out.println("Nota: " + notaFilmes.get(c));
            c++;
        }
    }

    public void removerFilmes(String nomeFilme){

        if (nomeFilmes.contains(nomeFilme)){
            notaFilmes.remove(nomeFilmes.indexOf(nomeFilme));
            nomeFilmes.remove(nomeFilme);
            System.out.println("=============================");
            System.out.println(nomeFilme + " foi removido do perfil de " + nomeUsuario + "!");
        } else {
            System.out.println("=============================");
            System.out.println("Filme não encontrado! Digite o nome correto do filme para excluir.");
        }
    }

    public void limparFilmes(){
        nomeFilmes.clear();
        notaFilmes.clear();
    }
}
