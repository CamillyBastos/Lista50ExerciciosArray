package Arrays;
import java.util.Scanner;

public class Ex48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][3];
        int[][] transposta = new int[3][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta:");

        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
