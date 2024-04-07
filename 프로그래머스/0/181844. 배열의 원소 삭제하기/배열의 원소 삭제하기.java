import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // 삭제할 원소를 Set에 저장
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }
        
        // 남은 원소들을 저장할 리스트 생성
        List<Integer> remainingList = new ArrayList<>();
        
        // arr을 순회하면서 delete_set에 포함되지 않는 원소만 리스트에 추가
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                remainingList.add(num);
            }
        }
        
        // 리스트를 배열로 변환하여 반환
        int[] result = new int[remainingList.size()];
        for (int i = 0; i < remainingList.size(); i++) {
            result[i] = remainingList.get(i);
        }
        
        return result;
    }
}
