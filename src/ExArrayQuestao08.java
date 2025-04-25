public class ExArrayQuestao08 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] iguais = new int[10];
        int index = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (nums1[j] == nums2[i]) {
                    iguais[index] = nums1[j];
                    index++;
                }
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println("O número " + iguais[i] + " aparece nos dois arrays");
        }
    }
}
