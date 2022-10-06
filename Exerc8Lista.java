import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Informe o nome do paciente:");
            String nome = teclado.next();
            System.out.println("Informe o sexo do paciente:");
            String sexo = teclado.next();
            System.out.println("Informe o idade do paciente:");
            int idade = teclado.nextInt();
            System.out.println("Informe o altura do paciente:");
            double altura = teclado.nextDouble();
            System.out.println("Informe o peso do paciente:");
            double peso = teclado.nextDouble();

            Paciente paciente = new Paciente(nome, sexo, idade, altura, peso);
            pacientes.add(paciente);
        } while (!pacientes.get(pacientes.size() - 1).nome.equalsIgnoreCase("fim"));

        System.out.println("A quantidade de pacientes é: " + pacientes.size());
        System.out.println("A média de idade dos homens é: " + calcularMediaDeIdadeDosHomens(pacientes));
        System.out.println("A quantidde de mulheres com altura maior que 1,60 e menor que 1,70 e mais de 70kg é: " + calcularQuantidadeDeMulheres(pacientes));
        System.out.println("A quantidade de pessoas entre 18 e 25 anos é: " + calcularQuantidadeDePessoasJovens(pacientes));
        System.out.println("O nome do paciente mais velho: " + nomeDoPacienteMaisVelho(pacientes));
    }

    private static double calcularMediaDeIdadeDosHomens(ArrayList<Paciente> pacientes) {
        double somaDasIdades = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.sexo.equalsIgnoreCase("masculino")) {
                somaDasIdades = somaDasIdades + paciente.getIdade();
            }
        }
        return somaDasIdades / pacientes.size();
    }

    private static int calcularQuantidadeDeMulheres(ArrayList<Paciente> pacientes) {
        int quantidade = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.sexo.equalsIgnoreCase("feminino")
                    && paciente.altura >= 1.6
                    && paciente.altura <= 1.7
                    && paciente.peso >= 70) {
                quantidade++;
            }
        }
        return quantidade;
    }

    private static int calcularQuantidadeDePessoasJovens(ArrayList<Paciente> pacientes) {
        int quantidade = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.idade >= 18 && paciente.idade <= 25) {
                quantidade++;
            }
        }
        return quantidade;
    }

    private static String nomeDoPacienteMaisVelho(ArrayList<Paciente> pacientes) {
        pacientes.sort(Comparator.comparing(Paciente::getIdade));
        Paciente pacienteMaisVelho = pacientes.get(pacientes.size() - 1);
        return pacienteMaisVelho.nome;
    }
}