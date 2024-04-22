public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            for (int i = start; i <= end; i++) {
                arr[i]++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int[][] queries = {{1, 3}, {2, 4}};
        int[] result = solution.solution(arr, queries);
        for (int num : result) {
            System.out.print(num + " "); // 결과 출력
        }
    }
}
