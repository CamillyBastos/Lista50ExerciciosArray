package Arrays;
import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                soma += numeros[i];
            }
        }

        System.out.println("Soma dos números ímpares: " + soma);

        sc.close();
    }
}
