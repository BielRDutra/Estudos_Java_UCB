import java.util.Scanner; //Lembra do #include ? Faça esta associação por enquanto para conseguir ler.	


  public class Leitura{
    public static void main (String args[]){
  //inicio 
    double salario;
    System.out.print("Informe um salário: ");
    salario = new Scanner(System.in).nextDouble( );// Comando grande, né? É só isso para ler um double
    int idade;
    System.out.print("Informe uma idade: ");
    idade = new Scanner(System.in).nextInt( );// só isso para ler um int
    System.out.printf(" \n O salário informado foi : %f", salario);
    System.out.print(" \n A idade informada foi :"+idade); 
  //fim 
  }
}
