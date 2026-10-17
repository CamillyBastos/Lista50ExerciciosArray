package Arrays;
import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] soma = new int[5];

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Digite o valor do primeiro array: ");
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Digite o valor do segundo array: ");
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < soma.length; i++) {
            soma[i] = array1[i] + array2[i];
        }

        System.out.println("Soma dos arrays:");

        for (int i = 0; i < soma.length; i++) {
            System.out.println(soma[i]);
        }

        sc.close();
    }
}
