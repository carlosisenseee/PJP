import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Questao09 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        Set<Integer> conjunto = new HashSet<>();
        for (int num : nums) {
            conjunto.add(num);
        }

        int[] arraySemRep = new int[conjunto.size()];
        int i = 0;
        for (int num : conjunto) {
            arraySemRep[i] = num;
            i++;
        }
        Arrays.sort(arraySemRep);

        for (int j = 0; j < arraySemRep.length; j++) {
            int repe = 0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] == arraySemRep[j]) {
                    repe++;
                }
            }
            System.out.println("O valor " + arraySemRep[j] + " repitiu " + repe + " vezes");
        }
    }
}

