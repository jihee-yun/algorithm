import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
         ArrayList<Integer> stk = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stk.isEmpty() && stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
            }
            stk.add(arr[i]);
        }

        int[] result = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            result[j] = stk.get(j);
        }

        return result;
    }
}