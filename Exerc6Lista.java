import java.util.Scanner;

public class Exerc6Lista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        int contador = 1;

        for(contador = 1; contador <= 12; contador++){
            System.out.print("Primeira nota: ");
            nota1 = sc.nextDouble();
            System.out.print("Segunda nota: ");
            contador++;
            nota2 = sc.nextDouble();
            media = sc.nextDouble();
            media = (nota1 + nota2) / 2;


        }

    }
}
