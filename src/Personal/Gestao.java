package Personal;

public class Gestao {
    public static void main(String[] args) {



    }
}

class Funcionario{

    private String nome;
    private String matricula;
    private String setor;
    private double salario;
    private int horaExtra;

    public Funcionario(String _nome, String _matricula, String _setor, double _salario, int _horaExtra){

        this.nome = _nome;
        this.matricula = _matricula;
        this.setor = _setor;
        this.salario = _salario;
        this.horaExtra = _horaExtra;

    }

    public String getNome(){ return nome; }
    public String getMatricula(){ return matricula; }
    public String getSetor(){ return setor; }
    public double getSalario(){ return salario; }
    public int getHoraExtra(){ return horaExtra; }

    public void setNome(String nome){ this.nome = nome;}
    public void setMatricula(String matricula){ this.matricula = matricula; }
    public void setSetor(String setor){ this.setor = setor; }
    public void setSalario(double salario){ this.salario = salario; }
    public void setHoraExtra(int horaExtra){ this.horaExtra = horaExtra; }

    public double calcularSalario(){

        return salario + (horaExtra * 60);

    }

    public void exibirDados(){
        System.out.println("Nome: " + nome +
                           " | Matricula: " + matricula +
                           " | Setor: " + setor +
                           " | Salário Final: R$ " + calcularSalario());

    }

}

class FuncionarioComum extends Funcionario{

    public FuncionarioComum(String nome, String matricula, String setor, double salario, int horaExtra){
        super(nome, matricula, setor, salario, horaExtra);
    }

    @Override
    public double calcularSalario(){

        return getSalario() + (getHoraExtra() * 60);

    }

    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome() +
                           " | Matrícula: " + getMatricula() +
                           " | Setor: " + getSetor() +
                           " | Salário Final: R$ " + calcularSalario());
    }
}

class Analista extends Funcionario{

    public Analista(String nome, String matricula, String setor, double salario, int horaExtra){
        super(nome, matricula, setor, salario, horaExtra);
    }

    @Override
    public double calcularSalario(){

        return getSalario() + (getSalario() * 15/100) + (getHoraExtra() * 60);

    }

    @Override
    public void exibirDados(){

        System.out.println("Nome: " + getNome() +
                           " | Matrícula: " + getMatricula() +
                           " | Setor: " + getSetor() +
                           " | Salário Final: R$ " + calcularSalario());

    }

}