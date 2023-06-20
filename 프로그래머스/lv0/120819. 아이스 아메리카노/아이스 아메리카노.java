class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
      if (money >= 5500) {
            int i = money / 5500;
            int rest = money % (5500 * i);
            answer[0] = i;
            answer[1] = rest;
        } else {
            answer[0] = 0;
            answer[1] = money;
        }
        return answer;
    }
}