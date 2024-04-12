public class Solution {
    public int solution(int[][] arr) {
        // 이차원 배열의 크기 구하기
        int n = arr.length;
        
        // 조건을 만족하는지 여부를 저장할 변수 초기화
        boolean isSymmetric = true;

        // 이차원 배열을 순회하면서 조건을 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 대칭적인 원소 확인
                if (arr[i][j] != arr[j][i]) {
                    // 대칭적이지 않으면 조건을 만족하지 않음
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        // 조건을 만족하면 1을, 아니면 0을 반환
        return isSymmetric ? 1 : 0;
    }
}
