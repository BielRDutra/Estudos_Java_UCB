package UCB.Universidade;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto do tipo Professor
        Professor professor = new Professor();
        professor.setNome("João da Silva");
        professor.setCpf("165.812.493-60");
        professor.setSalario(8000);
        professor.setTitulacao("MESTRE");

        // Exibindo informações do professor
        System.out.println("Professor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Salário: R$ " + professor.getSalario());
        System.out.println("Titulação: " + professor.getTitulacao());
        System.out.println("Imposto de Renda: R$ " + professor.getImpostoRenda());

        // Criando um objeto do tipo Administrativo
        Administrativo administrativo = new Administrativo();
        administrativo.setNome("Maria Oliveira");
        administrativo.setCpf("123.456.789-00");
        administrativo.setSalario(5000);
        administrativo.setDependentes("2");

        // Exibindo informações do administrativo
        System.out.println("\nAdministrativo:");
        System.out.println("Nome: " + administrativo.getNome());
        System.out.println("CPF: " + administrativo.getCpf());
        System.out.println("Salário: R$ " + administrativo.getSalario());
        System.out.println("Dependentes: " + administrativo.getDependentes());
        System.out.println("Contribuição Sindical: R$ " + administrativo.getContribuicaoSindical());
    }
}
