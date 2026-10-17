package Arrays;
import java.util.Scanner;

public class Ex28 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do aluno: ");
            nomes[i] = sc.nextLine();

            System.out.print("Nota do aluno: ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nRelatório dos alunos:");

        for (int i = 0; i < nomes.length; i++) {
            String situacao;

            if (notas[i] >= 7) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }

            System.out.println("Nome: " + nomes[i]);
            System.out.println("Nota: " + notas[i]);
            System.out.println("Situação: " + situacao);
            System.out.println("--------------------");
        }

        sc.close();
    }
}
