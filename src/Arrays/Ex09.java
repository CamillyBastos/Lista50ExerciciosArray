package Arrays;
import java.util.Scanner;

public class Ex09 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[10];
            int positivos = 0;
            int negativos = 0;
            int zeros = 0;

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > 0) {
                    positivos++;
                } else if (numeros[i] < 0) {
                    negativos++;
                } else {
                    zeros++;
                }
            }

            System.out.println("Positivos: " + positivos);
            System.out.println("Negativos: " + negativos);
            System.out.println("Zeros: " + zeros);

            sc.close();
        }
    }
