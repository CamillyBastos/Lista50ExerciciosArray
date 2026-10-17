package Arrays;
import java.util.Scanner;

public class Ex44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o valor para pesquisar: ");
        int pesquisa = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == pesquisa) {
                    System.out.println("Encontrado na linha " + i
                            + " e coluna " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }

        sc.close();
    }
}
