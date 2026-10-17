package Arrays;
import java.util.Scanner;

public class Ex12 {

          public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[8];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            System.out.print("Digite o número para pesquisar: ");
            int pesquisa = sc.nextInt();

            boolean encontrado = false;

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == pesquisa) {
                    System.out.println("Encontrado na posição " + i);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Número não encontrado.");
            }

            sc.close();
        }
    }

