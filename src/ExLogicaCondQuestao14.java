import java.util.Scanner;

public class ExLogicaCondQuestao14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("""
                    ****************
                    1 - Somar
                    2 - Subtrair
                    0 - Sair
                    ****************
                    """);
            System.out.print("Digite sua opção: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nInforme o primeiro número: ");
                    int num1 = scan.nextInt();
                    System.out.print("Informe o segundo número: ");
                    int num2 = scan.nextInt();
                    System.out.println("\nO resultado da soma é = " + (num1 + num2) + "\n");
                    break;
                case 2:
                    System.out.print("\nInforme o primeiro número: ");
                    int nume1 = scan.nextInt();
                    System.out.print("Informe o segundo número: ");
                    int nume2 = scan.nextInt();
                    System.out.println("\nO resultado da subtração é = " + (nume1 - nume2) + "\n");
                    break;
                case 0:
                    System.out.println("\nFinalizando a aplicação");
                    rodando = false;
                    break;
                default:
                    System.out.println("\nOpção Inválida\n");
                    break;
            }
        }
    }
}
