import javax.imageio.ImageReader;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println(maior);
        System.out.println(menor);
    }
}
