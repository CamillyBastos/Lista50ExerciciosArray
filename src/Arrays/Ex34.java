package Arrays;
import java.util.Scanner;

public class Ex34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("Menor valor: " + menor);

        sc.close();
    }
}
