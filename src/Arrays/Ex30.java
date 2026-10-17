package Arrays;
import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] quantidades = new int[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Nome do produto: ");
            produtos[i] = sc.nextLine();

            System.out.print("Quantidade em estoque: ");
            quantidades[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nProdutos com estoque abaixo de 5:");

        for (int i = 0; i < produtos.length; i++) {
            if (quantidades[i] < 5) {
                System.out.println("Produto: " + produtos[i]);
                System.out.println("Quantidade: " + quantidades[i]);
            }
        }

        sc.close();
    }
}
