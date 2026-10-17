package Arrays;
import java.util.Scanner;

public class Ex11 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] nomes = new String[5];

            for (int i = 0; i < nomes.length; i++) {
                System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                nomes[i] = sc.nextLine();
            }

            System.out.print("Digite o nome que deseja pesquisar: ");
            String pesquisa = sc.nextLine();

            boolean encontrado = false;

            for (int i = 0; i < nomes.length; i++) {
                if (pesquisa.equalsIgnoreCase(nomes[i])) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("Nome encontrado!");
            } else {
                System.out.println("Nome não encontrado.");
            }

            sc.close();
        }
    }

