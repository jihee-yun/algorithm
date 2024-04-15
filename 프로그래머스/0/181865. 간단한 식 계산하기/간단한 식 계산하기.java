public class Solution {
    public int solution(String binomial) {
        // 주어진 이항식을 공백을 기준으로 분할하여 피연산자와 연산자를 추출합니다.
        String[] parts = binomial.split(" ");
        int a = Integer.parseInt(parts[0]); // 첫 번째 피연산자
        char op = parts[1].charAt(0); // 연산자
        int b = Integer.parseInt(parts[2]); // 두 번째 피연산자

        // 연산자에 따라 계산을 수행합니다.
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            default:
                System.out.println("올바르지 않은 연산자입니다.");
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String binomial = "10 * 5"; // 예시 이항식
        System.out.println(solution.solution(binomial)); // 결과 출력
    }
}
