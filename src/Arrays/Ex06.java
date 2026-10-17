package Arrays;
import java.util.Scanner;

public class Ex06 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[6];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            int menor = numeros[0];

            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

            System.out.println("O menor número é: " + menor);

            sc.close();
        }
    }

