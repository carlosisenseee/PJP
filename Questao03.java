import java.util.Arrays;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o número " + (i+1) + ": ");
            nums[i] = scan.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
