public class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    sum += board[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] board = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int k = 2;
        System.out.println(solution.solution(board, k)); // 결과 출력
    }
}
