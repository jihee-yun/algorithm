public class Solution {
    public String solution(String myString) {
        char[] chars = myString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 'l') {
                chars[i] = 'l';
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String myString = "abcdefg";
        System.out.println(solution.solution(myString)); // 결과 출력
    }
}
