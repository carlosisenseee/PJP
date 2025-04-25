import java.util.Scanner;

public class ExLogicaCondQuestao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int n = scan.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Informe um número: ");
            soma = soma + scan.nextInt();
        }

        System.out.println("Soma total é igual a = " + soma);
    }
}
