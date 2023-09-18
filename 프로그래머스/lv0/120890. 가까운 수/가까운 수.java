class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int tmp = Integer.MAX_VALUE;
        
        
        for (int num : array) {
            int tmp2 = Math.abs(num - n);

            if (tmp2 < tmp || (tmp2 == tmp && num < answer)) {
                tmp = tmp2;
                answer = num;
            }
        }
        return answer;
    }
}