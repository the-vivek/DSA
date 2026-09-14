import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {

    static class Solution {

        public List<Integer> addToArrayForm(int[] num, int k) {

            ArrayList<Integer> result = new ArrayList<>();

            for (int i = num.length - 1; i >= 0 || k > 0; k /= 10) {

                if (i >= 0) {
                    k += num[i];
                    i--;
                }

                result.add(k % 10);
            }

            Collections.reverse(result);

            return result;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] num = {1, 2, 0, 0};
        int k = 34;

        List<Integer> result = obj.addToArrayForm(num, k);

        System.out.println(result);
    }
}