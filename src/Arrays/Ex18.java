package Arrays;
import java.util.Scanner;

public class Ex18 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double[] notas = new double[6];
            double soma = 0;

            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                notas[i] = sc.nextDouble();
                soma += notas[i];
            }

            double maior = notas[0];
            double menor = notas[0];

            for (int i = 1; i < notas.length; i++) {
                if (notas[i] > maior) {
                    maior = notas[i];
                }

                if (notas[i] < menor) {
                    menor = notas[i];
                }
            }

            double media = soma / notas.length;

            System.out.printf("Maior nota: %.2f%n", maior);
            System.out.printf("Menor nota: %.2f%n", menor);
            System.out.printf("Média da turma: %.2f%n", media);

            sc.close();
        }
    }
