package Arrays;
import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o multiplicador: ");
        int multiplicador = sc.nextInt();

        System.out.println("Resultados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " x " + multiplicador
                    + " = " + (numeros[i] * multiplicador));
        }

        sc.close();
    }
}
