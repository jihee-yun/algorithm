import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] solution(String my_string) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (char ch : my_string.toCharArray()) {
            if (ch != ' ') {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0); // StringBuilder 초기화
                }
            }
        }

        // 마지막 단어 추가
        if (word.length() > 0) {
            words.add(word.toString());
        }

        // List를 배열로 변환
        String[] result = new String[words.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = words.get(i);
        }

        return result;
    }
}
