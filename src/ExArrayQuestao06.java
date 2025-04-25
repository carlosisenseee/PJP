import java.util.Scanner;

public class ExArrayQuestao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        int[] rep = new int[10];
        int repitidos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Valor " + (i+1) + ": ");
            nums[i] = scan.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (nums[j] == nums[i] && i != j) {
                    rep[i] = i;
                    repitidos++;
                }
            }
        }
        for (int i = 0; i < repitidos; i++) {
            System.out.println("O valor " + nums[i] + " repitiu no indice " + rep[i]);
        }
    }
}
