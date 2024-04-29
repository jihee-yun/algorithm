public class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder result = new StringBuilder(); // 결과를 저장할 StringBuilder 선언

        // indices 배열에 있는 각 인덱스에 해당하는 글자를 제외하고 이어 붙임
        for (int i = 0; i < my_string.length(); i++) {
            if (!contains(indices, i)) { // 만약 indices 배열에 현재 인덱스가 없다면
                result.append(my_string.charAt(i)); // 현재 글자를 결과에 추가
            }
        }

        return result.toString(); // StringBuilder를 문자열로 변환하여 반환
    }

    // 배열에 특정 값이 포함되어 있는지 확인하는 메서드
    private boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // 테스트를 위한 main 메서드
    public static void main(String[] args) {
        Solution solution = new Solution();
        String my_string = "hello";
        int[] indices = {1, 3};
        System.out.println(solution.solution(my_string, indices)); // ol
    }
}
