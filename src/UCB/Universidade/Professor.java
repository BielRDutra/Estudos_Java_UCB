package UCB.Universidade;

public class Professor {
    private String nome;
    private String cpf;
    private double salario;
    private String titulacao;

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

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public double getImpostoRenda() {
        return salario * 0.15; // taxa fixa de 15% do salário
    }
}
