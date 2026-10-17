package Arrays;
import java.util.Scanner;

public class Ex38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];
        double[][] notas = new double[4][3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do aluno: ");
            nomes[i] = sc.nextLine();

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }

            sc.nextLine();
        }

        System.out.println("\nBOLETIM DOS ALUNOS");

        for (int i = 0; i < nomes.length; i++) {
            double soma = 0;

            System.out.println("\nAluno: " + nomes[i]);

            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
                soma += notas[i][j];
            }

            double media = soma / notas[i].length;

            System.out.printf("Média: %.2f%n", media);

            if (media >= 7) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
        }

        sc.close();
    }
}
