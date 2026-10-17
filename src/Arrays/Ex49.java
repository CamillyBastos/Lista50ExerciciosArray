package Arrays;
import java.util.Scanner;

public class Ex49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] vendas = new double[3][4];
        double[] totais = new double[3];

        for (int i = 0; i < vendas.length; i++) {
            System.out.println("Vendedor " + (i + 1));

            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print("Valor da venda " + (j + 1) + ": ");
                vendas[i][j] = sc.nextDouble();
                totais[i] += vendas[i][j];
            }
        }

        int maiorVendedor = 0;

        for (int i = 0; i < totais.length; i++) {
            System.out.printf("Total do vendedor %d: R$ %.2f%n",
                    (i + 1), totais[i]);

            if (totais[i] > totais[maiorVendedor]) {
                maiorVendedor = i;
            }
        }

        System.out.println("Vendedor que mais vendeu: "
                + (maiorVendedor + 1));

        System.out.printf("Total vendido: R$ %.2f%n",
                totais[maiorVendedor]);

        sc.close();
    }
}
