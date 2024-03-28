import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(String myString) {
        List<Integer> lengths = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                lengths.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        
        // 마지막 문자열의 길이 추가
        lengths.add(count);

        // List를 배열로 변환
        int[] result = new int[lengths.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = lengths.get(i);
        }

        return result;
    }
}
