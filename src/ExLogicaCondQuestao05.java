import java.util.Scanner;

public class ExLogicaCondQuestao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        int ano = scan.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 != 0) {
                System.out.println("Bissexto");
            } else if (ano % 100 == 0 && ano % 400 == 0) {
                System.out.println("Bissexto");
            } else {
                System.out.println("Não Bissexto");
            }
        }
    }
}
