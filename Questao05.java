import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            nums[i] = scan.nextInt();
            soma += nums[i];
        }
        int media = soma/nums.length;
        System.out.println("A média é " + media);
        for (int i = 0; i < 10; i++) {
            if (nums[i] > media) {
                System.out.println(nums[i] + " Esta acima da média, com o indice " + i);
            }
        }
    }
}
