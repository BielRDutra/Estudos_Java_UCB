package UCB;
public class BoletimEstudantil {

    public static void main(String[] args) {

        System.out.println("Boletim Estudantil");
        System.out.println("--------------");
        System.out.println("Aluno: João da Silva");
        System.out.println("Média Final: 7.0");
        System.out.println("--------------");
        System.out.println("Situação do Aluno:");

        
        int mediaFinal = 7;

        if (mediaFinal >=7) {
            System.out.println("Aluno Aprovado");
        }else if (mediaFinal == 6){
            System.out.println("Aluno de Recuperação");
        }else{
            System.out.println("Aluno Reprovado");
        }

    }

}
