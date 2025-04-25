import java.util.Scanner;

public class ExLogicaCondQuestao11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senha = 123;

        while (true) {
            System.out.println("Informe sua senha: ");
            if (scan.nextInt() == senha) {
                System.out.println("Senha Correta");
                break;
            } else {
                System.out.println("Senha Incorreta");
            }
        }
    }
}
