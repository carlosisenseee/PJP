import java.util.Scanner;

public class ExLogicaCondQuestao13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números deseja informar: ");
        int n = scan.nextInt();

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Informe um número: ");
            int num = scan.nextInt();
            if (num == 0) {
                zeros++;
            }
            if (num > 0) {
                positivos++;
            }
            if (num < 0){
                negativos++;
            }
        }
        System.out.println(positivos + " eram números positivos");
        System.out.println(negativos + " eram números negativos");
        System.out.println(zeros + " eram números zeros");
    }
}
