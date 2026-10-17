package Arrays;
import java.util.Scanner;

public class Ex13 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[10];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            System.out.print("Qual número deseja pesquisar? ");
            int pesquisa = sc.nextInt();

            int contador = 0;

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == pesquisa) {
                    contador++;
                }
            }

            System.out.println("O número " + pesquisa + " aparece " + contador + " vez(es).");

            sc.close();
        }
    }

