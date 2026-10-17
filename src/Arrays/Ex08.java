package Arrays;
import java.util.Scanner;

public class Ex08 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[10];
            int impares = 0;

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 != 0) {
                    impares++;
                }
            }

            System.out.println("Quantidade de números ímpares: " + impares);

            sc.close();
        }
    }
