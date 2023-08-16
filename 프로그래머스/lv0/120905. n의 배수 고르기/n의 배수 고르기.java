class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[0];
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                int[] newArray = new int[answer.length + 1];

                // 기존 배열의 내용을 새 배열로 복사
                for (int j = 0; j < answer.length; j++) {
                    newArray[j] = answer[j];
                }

                // 새로운 값 추가
                newArray[newArray.length - 1] = numlist[i];
                
                answer = newArray;
            }
        }
        return answer;
    }
}