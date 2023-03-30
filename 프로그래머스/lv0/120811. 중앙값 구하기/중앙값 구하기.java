class Solution {
    public int solution(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                int tmp = 0;
                if(array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        int middle = array.length / 2;
        int answer = array[middle];
        return answer;
    }
}