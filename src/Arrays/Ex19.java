package Arrays;
import java.util.Scanner;

public class Ex19 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[5];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            int temporario = numeros[0];

            numeros[0] = numeros[numeros.length - 1];
            numeros[numeros.length - 1] = temporario;

            System.out.println("Array após a troca:");

            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
            }

            sc.close();
        }
    }

