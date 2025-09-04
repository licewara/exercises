package Personal;

import java.util.ArrayList;

public class Gestao {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioComum("Ana", "001", "TI", 3000, 10));
        funcionarios.add(new FuncionarioComum("Bruno", "002", "RH", 2500, 5));
        funcionarios.add(new Analista("Carla", "003", "Comercial", 4000, 8));
        funcionarios.add(new Analista("Daniel", "004", "Produção", 3500, 0));
        funcionarios.add(new Gerente("Eduardo", "005", "TI", 8000));
        funcionarios.add(new Gerente("Fernanda", "006", "RH", 7500));
        funcionarios.add(new Diretor("Gustavo", "007", "Comercial", 12000));
        funcionarios.add(new Diretor("Helena", "008", "Financeiro", 15000));
        funcionarios.add(new Estagiario("Igor", "009", "TI"));
        funcionarios.add(new Estagiario("Julia", "010", "RH"));
        funcionarios.add(new FuncionarioComum("Karla", "011", "Produção", 2800, 2));
        funcionarios.add(new Analista("Leonardo", "012", "Comercial", 4200, 4));
        funcionarios.add(new Gerente("Mariana", "013", "Produção", 9000));
        funcionarios.add(new Diretor("Natália", "014", "TI", 20000));
        funcionarios.add(new Estagiario("Otávio", "015", "Comercial"));

        System.out.println("=== LISTAGEM DE FUNCIONÁRIOS ===");
        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }

        double folhaTotal = 0;
        for (Funcionario f : funcionarios) {
            folhaTotal += f.calcularSalario();
        }
        System.out.println("\nCusto total da folha: R$ " + folhaTotal);

        Funcionario maior = funcionarios.get(0);
        Funcionario menor = funcionarios.get(0);

        for (Funcionario f : funcionarios) {
            if (f.calcularSalario() > maior.calcularSalario()) {
                maior = f;
            }
            if (f.calcularSalario() < menor.calcularSalario()) {
                menor = f;
            }
        }

        System.out.println("\nMaior salário: " + maior.getNome() + " - R$ " + maior.calcularSalario());
        System.out.println("Menor salário: " + menor.getNome() + " - R$ " + menor.calcularSalario());

        System.out.println("\n=== MÉTODOS ESPECÍFICOS ===");
        for (Funcionario f : funcionarios) {
            if (f instanceof Gerente) {
                ((Gerente) f).acompanharEquipe();
            } else if (f instanceof Diretor) {
                ((Diretor) f).aprovarRelatorioFinanceiro();
            } else if (f instanceof Estagiario) {
                ((Estagiario) f).gerarRelatorioEstagio();
            }
        }
    }
}

class Funcionario {

    private String nome;
    private String matricula;
    private String setor;
    private double salario;
    private int horaExtra;

    public Funcionario(String _nome, String _matricula, String _setor, double _salario, int _horaExtra) {
        this.nome = _nome;
        this.matricula = _matricula;
        this.setor = _setor;
        this.salario = _salario;
        this.horaExtra = _horaExtra;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public String getSetor() { return setor; }
    public double getSalario() { return salario; }
    public int getHoraExtra() { return horaExtra; }

    public void setNome(String nome) { this.nome = nome; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public void setSetor(String setor) { this.setor = setor; }
    public void setSalario(double salario) { this.salario = salario; }
    public void setHoraExtra(int horaExtra) { this.horaExtra = horaExtra; }

    public double calcularSalario() {
        return salario + (horaExtra * 60);
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome +
                " | Matricula: " + matricula +
                " | Setor: " + setor +
                " | Salário Final: R$ " + calcularSalario());
    }
}

class FuncionarioComum extends Funcionario {

    public FuncionarioComum(String nome, String matricula, String setor, double salario, int horaExtra) {
        super(nome, matricula, setor, salario, horaExtra);
    }

    @Override
    public double calcularSalario() {
        return getSalario() + (getHoraExtra() * 60);
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome() +
                " | Matrícula: " + getMatricula() +
                " | Setor: " + getSetor() +
                " | Salário Final: R$ " + calcularSalario());
    }
}

class Analista extends Funcionario {

    public Analista(String nome, String matricula, String setor, double salario, int horaExtra) {
        super(nome, matricula, setor, salario, horaExtra);
    }

    @Override
    public double calcularSalario() {
        return getSalario() + (getSalario() * 0.15) + (getHoraExtra() * 60);
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome() +
                " | Matrícula: " + getMatricula() +
                " | Setor: " + getSetor() +
                " | Salário Final: R$ " + calcularSalario());
    }
}

class Gerente extends Funcionario {

    public Gerente(String nome, String matricula, String setor, double salario) {
        super(nome, matricula, setor, salario, 0);
    }

    @Override
    public double calcularSalario() {
        return getSalario() + 3000;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome() +
                " | Matrícula: " + getMatricula() +
                " | Setor: " + getSetor() +
                " | Salário Final: R$ " + calcularSalario());
    }

    public void acompanharEquipe() {
        System.out.println(getNome() + " está acompanhando a equipe.");
    }
}

class Diretor extends Funcionario {

    public Diretor(String nome, String matricula, String setor, double salario) {
        super(nome, matricula, setor, salario, 0);
    }

    @Override
    public double calcularSalario() {
        return getSalario() + 7000 + (getSalario() * 0.20);
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome() +
                " | Matrícula: " + getMatricula() +
                " | Setor: " + getSetor() +
                " | Salário Final: R$ " + calcularSalario());
    }

    public void aprovarRelatorioFinanceiro() {
        System.out.println(getNome() + " aprovou o relatório financeiro.");
    }
}

class Estagiario extends Funcionario {

    public Estagiario(String nome, String matricula, String setor) {
        super(nome, matricula, setor, 1800, 0);
    }

    @Override
    public double calcularSalario() {
        return 1800;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome() +
                " | Matrícula: " + getMatricula() +
                " | Setor: " + getSetor() +
                " | Salário Final: R$ " + calcularSalario());
    }

    public void gerarRelatorioEstagio() {
        System.out.println(getNome() + " gerou um relatório de estágio.");
    }
}