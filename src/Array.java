import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        int[]nums = new int[5]; // inicialização
        for(int i = 0; i < nums.length; i++ ) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            nums[i] = new Scanner(System.in).nextInt();
        }
        for(int i = 0; i < nums.length; i++ ) {
            System.out.println("O " + (i + 1) + "º número é: " + nums[i]);
        }
    }
}
