package Arrays;
import java.util.Scanner;

public class Ex50 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] estoque = new int[3][5];
        int[] totalLojas = new int[3];
        int[] totalProdutos = new int[5];

        for (int i = 0; i < estoque.length; i++) {
            System.out.println("Loja " + (i + 1));

            for (int j = 0; j < estoque[i].length; j++) {
                System.out.print("Quantidade do produto "
                        + (j + 1) + ": ");
                estoque[i][j] = sc.nextInt();

                totalLojas[i] += estoque[i][j];
                totalProdutos[j] += estoque[i][j];
            }
        }

        System.out.println("\nTotal de produtos por loja:");

        int maiorLoja = 0;

        for (int i = 0; i < totalLojas.length; i++) {
            System.out.println("Loja " + (i + 1)
                    + ": " + totalLojas[i]);

            if (totalLojas[i] > totalLojas[maiorLoja]) {
                maiorLoja = i;
            }
        }

        System.out.println("\nTotal de cada produto:");

        for (int j = 0; j < totalProdutos.length; j++) {
            System.out.println("Produto " + (j + 1)
                    + ": " + totalProdutos[j]);
        }

        System.out.println("\nLoja com maior estoque: Loja "
                + (maiorLoja + 1));

        System.out.println("Total em estoque: "
                + totalLojas[maiorLoja]);

        sc.close();
    }
}
