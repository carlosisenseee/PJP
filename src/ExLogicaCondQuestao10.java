import java.util.Scanner;

public class ExLogicaCondQuestao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = scan.nextInt();
        int resultado = 1;

        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        System.out.println(resultado);

    }
}
