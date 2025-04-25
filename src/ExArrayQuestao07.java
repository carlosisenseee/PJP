import java.util.Scanner;

public class ExArrayQuestao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums1 = new int[5];
        int[] nums2 = new int[5];
        int[] prod = new int[5];

        System.out.println("Informe os valores do Arrey 1");
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            nums1[i] = scan.nextInt();
        }

        System.out.println("Informe os valores do Arrey 2");
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            nums2[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            prod[i] = nums1[i] * nums2[i];
            System.out.println("O valor do indice " + i + " é igual a " + prod[i]);
        }
    }
}
