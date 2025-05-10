package UCB.Universidade;

public class Administrativo {
    private String nome;
    private String cpf;
    private double salario;
    private String dependentes;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setDependentes(String dependentes) {
        this.dependentes = dependentes;
    }

    public String getDependentes() {
        return dependentes;
    }

    public double getContribuicaoSindical() {
        return salario * 0.01; // taxa fixa de 1% do salário
    }
}
