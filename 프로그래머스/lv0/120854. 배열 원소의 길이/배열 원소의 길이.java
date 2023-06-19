class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        String word = "";
        for(int i = 0; i < strlist.length; i++) {
            word = strlist[i];
            int count = word.length();
            answer[i] = count;
        }
        
        return answer;
    }
}