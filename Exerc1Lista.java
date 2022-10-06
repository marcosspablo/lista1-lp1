import java.util.Scanner;

public class Exerc1Lista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario, salarionovo, aumento, percentual;

        System.out.print("Digite seu salário: R$ ");
        salario = sc.nextDouble();
        System.out.print("Digite a porcentagem de aumento: ");
        percentual = sc.nextDouble();

        aumento = (percentual/100) * salario;
        salarionovo = salario + aumento;

        System.out.printf("O novo salário com aumento é %.2f", salarionovo);


    }
}
