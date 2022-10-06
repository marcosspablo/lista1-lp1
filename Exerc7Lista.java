import java.util.ArrayList;
import java.util.Scanner;

public class Exerc7Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> conta = new ArrayList();

        double dias, total, diaria;
        String cliente, fechar;
         total = 0;

       while(true) {
           System.out.print("Nome do Cliente:");
           cliente = sc.next();
           System.out.print("Dias: ");
           dias = sc.nextDouble();
           System.out.println("Deseja continuar? Sim ou Nao: ");
           fechar = sc.next();

           if (dias < 10){
               total = (dias * 15) + 40;
           System.out.print("A conta do(a) Sr(a) " + cliente + " é de R$ " + total);
           conta.add(total);

           }else if(dias >= 10) {
               total = (dias * 8) + 40;
               System.out.println("A conta do(a) Sr(a) " + cliente + " é de R$ " + total );
               conta.add(total);
           }



            if (fechar.equals("Nao"))
                break;

        }
        System.out.println(conta);
    }
}
