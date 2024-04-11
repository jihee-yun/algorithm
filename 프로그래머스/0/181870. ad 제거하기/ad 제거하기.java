import java.util.*;

public class Solution {
    public String[] solution(String[] strArr) {
        // 결과를 저장할 리스트 생성
        List<String> result = new ArrayList<>();

        // 배열을 순회하면서 "ad"를 포함하지 않는 문자열을 결과 리스트에 추가
        for (String str : strArr) {
            if (!str.contains("ad")) {
                result.add(str);
            }
        }

        // 리스트를 배열로 변환하여 반환
        return result.toArray(new String[0]);
    }
}
