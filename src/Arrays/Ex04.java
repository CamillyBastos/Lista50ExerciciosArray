package Arrays;
import java.util.Scanner;

public class Ex04 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double[] notas = new double[4];
            double soma = 0;

            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                notas[i] = sc.nextDouble();
                soma += notas[i];
            }

            double media = soma / notas.length;

            System.out.printf("Média final: %.2f%n", media);

            sc.close();
        }
    }

