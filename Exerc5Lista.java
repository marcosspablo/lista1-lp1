import java.util.Scanner;

public class Exerc5Lista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario, prestacao;


        System.out.print("Digite seu salário: R$ ");
        salario = sc.nextDouble();
        System.out.print("Digite a prestação desejada: R$ ");
        prestacao = sc.nextDouble();

        if (prestacao <= 0.30 * salario){
            System.out.println("Parabéns!!!Você Conseguiu a Linha de Crédito!");
        }else {
            System.out.println("Não será possível pegar a Linha de Crédito");
            System.out.print("A prestação excedeu 30% do salário");
        }
    }
}
