import java.util.Scanner;

public class ExLogicaCondQuestao12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int aleatorio = (int)(Math.random() * 100);

        while (true) {
            System.out.print("Chute um número: ");
            int numero = scan.nextInt();
            if (numero == aleatorio) {
                System.out.println("Acertou!!!");
                break;
            } else {
                if (numero > aleatorio) {
                    System.out.println("Errou, o número escolhido é menor");
                } else {
                    System.out.println("Errou, o número escolhido é maior");
                }
                System.out.println();
            }
        }
    }
}
