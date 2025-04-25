import java.util.Scanner;

public class ExLogicaCondQuestao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "x" + i + " = " + (num*i));
        }
    }
}
