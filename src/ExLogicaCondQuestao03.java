import java.util.Scanner;

public class ExLogicaCondQuestao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        byte idade = scan.nextByte();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança (0-12)");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente (13-17)");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto (18-59)");
        } else if (idade >= 60) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade Inválida");
        }
    }
}
