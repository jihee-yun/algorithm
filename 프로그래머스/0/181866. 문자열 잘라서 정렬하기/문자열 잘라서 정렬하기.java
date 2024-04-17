import java.util.*;

public class Solution {
    public String[] solution(String myString) {
        // 문자열을 "x"를 기준으로 분할하여 배열로 만듭니다.
        String[] parts = myString.split("x");
        
        // 빈 문자열을 제외하고 ArrayList에 추가합니다.
        ArrayList<String> result = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                result.add(part);
            }
        }
        
        // 사전순으로 정렬합니다.
        Collections.sort(result);
        
        // ArrayList를 배열로 변환하여 반환합니다.
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String myString = "axbxxcxdxexfxgxhxixjx"; // 예시 문자열
        String[] result = solution.solution(myString);
        for (String s : result) {
            System.out.println(s); // 결과 출력
        }
    }
}
