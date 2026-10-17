package Arrays;
import java.util.Scanner;


public class Ex20 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[6];
            boolean repetido = false;

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            for (int i = 0; i < numeros.length; i++) {
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        repetido = true;
                    }
                }
            }

            if (repetido) {
                System.out.println("Existe número repetido no array.");
            } else {
                System.out.println("Não existem números repetidos.");
            }

            sc.close();
        }
    }

