public class Solution {
    public int solution(String myString, String pat) {
        int count = 0; // 등장 횟수를 저장할 변수
        int patLength = pat.length(); // pat의 길이

        // myString을 탐색하면서 pat이 등장하는 횟수를 카운트
        for (int i = 0; i <= myString.length() - patLength; i++) {
            if (myString.substring(i, i + patLength).equals(pat)) {
                count++; // pat과 일치하는 부분이 발견될 때마다 카운트 증가
            }
        }

        return count; // 등장 횟수 반환
    }

    // 테스트를 위한 main 메서드
    public static void main(String[] args) {
        Solution solution = new Solution();
        String myString = "abcbabcbabc";
        String pat = "abc";
        System.out.println(solution.solution(myString, pat)); // 3
    }
}
