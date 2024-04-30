public class Solution {
    public int solution(int[] num_list) {
        int totalOperations = 0; // 총 연산 횟수를 저장할 변수

        // 리스트의 각 원소에 대해 연산을 수행하여 1로 만듦
        for (int num : num_list) {
            while (num != 1) { // 숫자가 1이 아니라면 계속해서 연산 수행
                if (num % 2 == 0) { // 짝수라면
                    num /= 2;
                } else { // 홀수라면
                    num = (num - 1) / 2;
                }
                totalOperations++; // 연산 횟수 증가
            }
        }

        return totalOperations; // 총 연산 횟수 반환
    }

    // 테스트를 위한 main 메서드
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num_list = {10, 15, 20};
        System.out.println(solution.solution(num_list)); // 7
    }
}
