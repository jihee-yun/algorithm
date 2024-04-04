public class Solution {
    public String solution(String n_str) {
        // 문자열을 문자 배열로 변환
        char[] chars = n_str.toCharArray();
        
        // 가장 왼쪽에 있는 0을 찾아서 제거
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue; // 0을 만나면 다음 문자로 넘어감
            } else {
                return n_str.substring(i); // 0 이외의 문자가 나오면 해당 인덱스부터 끝까지 잘라서 반환
            }
        }
        
        // 모든 문자가 0인 경우
        return "0";
    }
}
