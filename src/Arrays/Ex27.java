package Arrays;
import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[6];
        int contador = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.nextLine();
        }

        for (int i = 0; i < nomes.length; i++) {
            if (!nomes[i].isEmpty()
                    && nomes[i].toUpperCase().charAt(0) == 'A') {
                contador++;
            }
        }

        System.out.println("Nomes que começam com A: " + contador);

        sc.close();
    }
}
