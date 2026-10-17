package Arrays;
import java.util.Scanner;

public class Ex05 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[6];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            int maior = numeros[0];

            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
            }

            System.out.println("O maior número é: " + maior);

            sc.close();
        }
}
