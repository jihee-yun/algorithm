import java.util.*;

public class Solution {
    public static int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String numStr = Integer.toString(i);
            boolean isSpecial = true;

            for (char c : numStr.toCharArray()) {
                if (c != '0' && c != '5') {
                    isSpecial = false;
                    break;
                }
            }

            if (isSpecial) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            int[] noResult = {-1};
            return noResult;
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}