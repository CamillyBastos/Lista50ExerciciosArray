package Arrays;
import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Cadastre um produto: ");
            produtos[i] = sc.nextLine();
        }

        System.out.println("\n1 - Listar produtos");
        System.out.println("2 - Buscar produto");
        System.out.println("3 - Quantidade cadastrada");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Produtos cadastrados:");

                for (int i = 0; i < produtos.length; i++) {
                    System.out.println(produtos[i]);
                }
                break;

            case 2:
                System.out.print("Digite o nome do produto: ");
                String pesquisa = sc.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < produtos.length; i++) {
                    if (produtos[i].equalsIgnoreCase(pesquisa)) {
                        System.out.println("Produto encontrado: " + produtos[i]);
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("Produto não encontrado.");
                }
                break;

            case 3:
                System.out.println("Quantidade cadastrada: " + produtos.length);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
