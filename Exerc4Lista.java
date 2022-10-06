import java.util.Scanner;

public class Exerc4Lista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double litros, valor, total;
        System.out.println("Digite a quantidade de litros abastecido: ");
        litros = sc.nextDouble();

        valor = litros * 2.50;
        total = valor + (2 * 3);

        System.out.println("O valor total da conta foi R$ " + total);

    }
}
