package UCB;

public class ImpostodeRenda{
  public static void main(String args[]){
    Professor prof = new Professor();
    prof.setNome("João da Silva");//método acessor herdado
    prof.setCpf("165.812.493-60");//método acessor herdado
    prof.setSalario(8000);        //método acessor herdado
    prof.setTitulacao("MESTRE");  //método acessor de professor
    double ir = prof.getImpostoRenda();
    System.out.println("Sr(a) "+prof.getNome()+" irá pagar de imposto o valor: R$ "+prof.getImpostoRenda());
    }
}
class Funcionario {
  private String nome;
  private String cpf;
  private double salario; 
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return nome;
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public String getCpf(){
    return cpf;
  }
  public void setSalario(double salario){
    this.salario = salario;
  }
  public double getSalario(){
    return salario;
  }
}
class Professor extends Funcionario{//vinculo de herança
  private String titulacao;
  public void setTitulacao(String titulacao){
    this.titulacao = titulacao;
  }
  public String getTitulacao(){
    return titulacao;
  }
  public double getImpostoRenda(){
    return getSalario() * 0.15; //taxa fixa de 15% do salário
  }
}
class Administrativo extends Funcionario{//vínculo de herança
  private String dependentes;
  public void setDependentes(String dependentes){
    this.dependentes = dependentes;
  }
  public String getDependentes(){
    return dependentes;
  }
  public double getContribuicaoSindical(){
    return getSalario() * 0.01; //taxa fixa de 1% do salario
  }

}
