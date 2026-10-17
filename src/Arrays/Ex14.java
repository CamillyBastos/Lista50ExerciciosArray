package Arrays;
import java.util.Scanner;

public class Ex14 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[6];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            System.out.println("Valores na ordem inversa:");

            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.println(numeros[i]);
            }

            sc.close();
        }
    }

