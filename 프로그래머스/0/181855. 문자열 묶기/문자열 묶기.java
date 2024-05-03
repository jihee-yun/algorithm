import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> groupCounts = new HashMap<>(); // 그룹 크기별 그룹 개수를 저장할 맵

        // 문자열 배열의 각 원소를 그룹으로 묶어서 맵에 그룹 개수를 계산
        for (String str : strArr) {
            int len = str.length(); // 현재 문자열의 길이

            // 맵에 해당 길이의 그룹 개수를 업데이트
            groupCounts.put(len, groupCounts.getOrDefault(len, 0) + 1);
        }

        int maxGroupSize = 0; // 가장 큰 그룹의 크기를 저장할 변수

        // 맵을 순회하면서 가장 큰 그룹의 크기를 찾음
        for (int groupSize : groupCounts.values()) {
            if (groupSize > maxGroupSize) {
                maxGroupSize = groupSize;
            }
        }

        return maxGroupSize; // 가장 큰 그룹의 크기 반환
    }

    // 테스트를 위한 main 메서드
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strArr = {"a", "bb", "ccc", "dd", "ee"};
        System.out.println(solution.solution(strArr)); // 2
    }
}
