import java.util.Scanner;

public class ExArrayQuestao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[10];
        int posi = 0;
        int neg = 0;
        int zero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o número " + (i+1) + ": ");
            nums[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < 10; i++) {
            if (nums[i] == 0 ) {
                zero++;
            } else if (nums[i] > 0) {
                posi++;
            } else {
                neg++;
            }
        }
        System.out.println(posi + " POSITIVOS");
        System.out.println(neg + " NEGATIVOS");
        System.out.println(zero + " ZEROS");
    }
}
