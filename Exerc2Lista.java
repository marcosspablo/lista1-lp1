import java.util.Scanner;

public class Exerc2Lista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        for(int c =1; c <= 10; c++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            if (num % 2 == 0){
                System.out.println("Este número é PAR");


            }if(num % 2 ==1){
                System.out.println("Este número é ÍMPAR ");
            }

        }


    }
}
