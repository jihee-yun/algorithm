public class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder result = new StringBuilder();

        // 문자열 배열을 순회하면서 제외하려는 문자열을 포함하지 않는 경우에만 결과 문자열에 추가
        for (String str : str_list) {
            if (!str.contains(ex)) {
                result.append(str);
            }
        }

        return result.toString();
    }
}
