class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        // n 이후의 원소들을 저장하는 배열
        int[] afterN = new int[num_list.length - n];
        for (int i = n; i < num_list.length; i++) {
            afterN[i - n] = num_list[i];
        }
        
        // n 이전의 원소들을 저장하는 배열
        int[] beforeN = new int[n];
        for (int i = 0; i < n; i++) {
            beforeN[i] = num_list[i];
        }
        
        // 두 배열을 합쳐서 새로운 배열 생성
        for (int i = 0; i < afterN.length; i++) {
            answer[i] = afterN[i];
        }
        for (int i = 0; i < beforeN.length; i++) {
            answer[afterN.length + i] = beforeN[i];
        }
        
        return answer;
    }
}
