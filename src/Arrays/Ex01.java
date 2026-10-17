package Arrays;
import java.util.Scanner;

public class Ex01 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] nomes = new String[5];

            for (int i = 0; i < nomes.length; i++) {
                System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                nomes[i] = sc.nextLine();
            }

            System.out.println("\nNomes cadastrados:");

            for (int i = 0; i < nomes.length; i++) {
                System.out.println(nomes[i]);
            }

            sc.close();
        }
    }
