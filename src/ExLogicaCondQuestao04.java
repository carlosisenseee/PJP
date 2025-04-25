import java.util.Scanner;

public class ExLogicaCondQuestao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int n2 = scan.nextInt();

        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Multiplicação: " + (n1 * n2));
        if (n2 == 0) {
            System.out.println("Divisão inválida, divisão por zero");
        } else {
            System.out.println("Divisão: " + (n1 / n2));
        }
    }
}
