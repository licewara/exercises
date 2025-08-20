package Personal;

public class FaculdadeOrion {
    public static void main(String[] args){

        //Aluna Maria Souza
        Aluno aluno1 = new Aluno("Maria Souza", 2025101200, 8, 9);
        Curso curso1 = new Curso("Análise e Desenvolvimento de Sistemas", 600, aluno1);
        Faculdade faculdade1 = new Faculdade("Orion", "Rua das Jujubas", curso1);

        System.out.println(faculdade1.resumo());

        //Aluno João Lima
        Aluno aluno2 = new Aluno("João Lima", 2025101201, 5, 7);
        Curso curso2 = new Curso("Análise e Desenvolvimento de Sistemas", 600, aluno2);
        Faculdade faculdade2 = new Faculdade("Orion", "Rua dos Morcegos", curso2);

        aluno2.setNota1(6);
        aluno2.setNota2(8);

        System.out.println(aluno2.CalcularMedia());

        //Aluna Ana
        Aluno aluno3 = new Aluno("Ana", 2025101202, 8, 7);
        Curso curso3 = new Curso("Análise e Desenvolvimento de Sistemas", 600, aluno3);
        Faculdade faculdade3 = new Faculdade("Orion", "Rua dos Morcegos", curso3);

        //Aluna Ana
        Aluno aluno4 = new Aluno("Bruno", 2025101202, 10, 7);
        Curso curso4 = new Curso("Análise e Desenvolvimento de Sistemas", 600, aluno4);
        Faculdade faculdade4 = new Faculdade("Orion", "Rua dos Morcegos", curso4);



    }
}

class Aluno {

    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int matricula, double nota1, double nota2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    double CalcularMedia(){
        double media = (nota1 + nota2) / 2;

        return media;
    }
}

class Curso {

    private String nomeCurso;
    private int cargaHoraria;
    private Aluno aluno;

    public Curso(String nomeCurso, int cargaHoraria, Aluno aluno){

        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
        this.aluno = aluno;

    }

    public String getNomeCurso(){
        return nomeCurso;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    String descricao(){
        String infos = getNomeCurso() + ", " + aluno.getNome() + ", " + aluno.CalcularMedia();

        return infos;
    }
}

class Faculdade {

    private String nomeFaculdade;
    private String endereco;
    private Curso curso;

    public Faculdade(String nomeFaculdade, String endereco, Curso curso){
        this.nomeFaculdade = nomeFaculdade;
        this.endereco = endereco;
        this.curso = curso;
    }

    public String getNomeFaculdade(){
        return nomeFaculdade;
    }

    public String getEndereco(){
        return endereco;
    }

    public Curso getCurso(){
        return curso;
    }

    public void setNomeFaculdade(String nomeFaculdade){
        this.nomeFaculdade = nomeFaculdade;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    String resumo(){
        String resumo = getNomeFaculdade() + ", " + getEndereco() + ", " + curso.descricao();

        return resumo;
    }
}

