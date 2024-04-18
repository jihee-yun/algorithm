import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // 두 개의 구간을 담을 ArrayList를 생성합니다.
        ArrayList<Integer> merged = new ArrayList<>();
        
        // 첫 번째 구간을 배열에 추가합니다.
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            merged.add(arr[i]);
        }
        
        // 두 번째 구간을 배열에 추가합니다.
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            merged.add(arr[i]);
        }
        
        // ArrayList를 배열로 변환하여 반환합니다.
        int[] result = new int[merged.size()];
        for (int i = 0; i < merged.size(); i++) {
            result[i] = merged.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{0, 2}, {3, 4}}; // 예시 구간
        int[] result = solution.solution(arr, intervals);
        System.out.println(Arrays.toString(result)); // 결과 출력
    }
}
