public class Solution {
    public String solution(String myString, String pat) {
        String longestSubstring = ""; // 가장 긴 부분 문자열을 저장할 변수

        // myString의 모든 부분 문자열을 탐색
        for (int i = 0; i < myString.length(); i++) {
            for (int j = i + 1; j <= myString.length(); j++) {
                String substring = myString.substring(i, j); // 현재 부분 문자열

                // 부분 문자열이 pat으로 끝나는지 확인하고, 현재까지 찾은 가장 긴 부분 문자열보다 길다면 업데이트
                if (substring.endsWith(pat) && substring.length() > longestSubstring.length()) {
                    longestSubstring = substring;
                }
            }
        }

        return longestSubstring; // 가장 긴 부분 문자열 반환
    }

    // 테스트를 위한 main 메서드
    public static void main(String[] args) {
        Solution solution = new Solution();
        String myString = "abcdefgabc";
        String pat = "abc";
        System.out.println(solution.solution(myString, pat)); // "abcdefgabc"
    }
}
