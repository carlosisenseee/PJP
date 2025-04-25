import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o número " + (i+1) + ": ");
            numeros[i] = scan.nextInt();
            soma += numeros[i];
        }

        System.out.println(soma);
    }
}
