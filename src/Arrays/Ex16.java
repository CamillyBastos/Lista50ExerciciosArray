package Arrays;
import java.util.Scanner;

public class Ex16 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[5];
            int[] dobros = new int[5];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();

                dobros[i] = numeros[i] * 2;
            }

            System.out.println("\nArray original:");

            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
            }

            System.out.println("\nArray com os dobros:");

            for (int i = 0; i < dobros.length; i++) {
                System.out.print(dobros[i] + " ");
            }

            sc.close();
        }
    }

