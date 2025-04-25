public class ExArrayQuestao10 {
    public static void main(String[] args) {
        int[] num = {5, 2, 8, 7, 3};
        int n = num.length;
        int cont = 1;

        System.out.print("Array Inicial: ");
        for (int x = 0; x < n; x++) {
            System.out.print(num[x] + " ");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
                System.out.print(cont + "º Passo: ");
                for (int x = 0; x < n; x++) {
                    System.out.print(num[x] + " ");
                }
                cont++;
                System.out.println();
            }
        }
        System.out.print("Array ordenado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
}