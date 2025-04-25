import java.util.Scanner;

public class ExLogicaCondQuestao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Número 1: ");
        int n1 = scan.nextInt();

        System.out.print("Número 2: ");
        int n2 = scan.nextInt();

        System.out.print("Número 3: ");
        int n3 = scan.nextInt();

        int maior = 0;

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        }
        if (n2 > n1 && n2 > n3) {
            maior = n2;
        }
        if (n3 > n1 && n3 > n2) {
            maior = n3;
        }
        System.out.println(maior + " é o maior");
    }
}
