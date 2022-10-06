import java.util.Scanner;

public class Exerc3Lista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario, salarionovo;
        String funcionario;

        while(true){
            System.out.println();
            System.out.print("Digite o nome do Funcionário ou fim para sair: ");
            funcionario = sc.next().toUpperCase();
            if(funcionario.equals("FIM")) {
                break;
            }
            System.out.print("Digite seu salário: R$ ");
            salario = sc.nextDouble();
            salarionovo = (salario * 0.20) + salario;


            if (salario <= 500){
                System.out.println("Seu novo salário é de R$ " + salarionovo);

            }if(salario > 500){
                System.out.println("Seu salário não receberá aumento");

            }

            }

        }
    }

