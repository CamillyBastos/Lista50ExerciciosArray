package Arrays;
import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.nextLine();
        }

        System.out.println("Nomes com mais de 5 letras:");

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].length() > 5) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
