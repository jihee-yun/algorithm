public class Solution {
    public int solution(String myString, String pat) {
        // "A"를 "B"로, "B"를 "A"로 치환
        String replacedString = myString.replace("A", "temp").replace("B", "A").replace("temp", "B");
        
        // 치환된 문자열이 pat을 포함하는지 확인
        if (replacedString.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}
