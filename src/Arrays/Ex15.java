package Arrays;
import java.util.Scanner;

public class Ex15 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[5];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            System.out.println("Dobro dos valores:");

            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i] + " x 2 = " + (numeros[i] * 2));
            }

            sc.close();
        }
}
