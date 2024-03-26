public class Solution {
    public int[] solution(int[] arr, int n) {
        int length = arr.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            if ((length % 2 == 0 && i % 2 != 0) || (length % 2 != 0 && i % 2 == 0)) {
                result[i] = arr[i] + n;
            } else {
                result[i] = arr[i];
            }
        }

        return result;
    }
}
