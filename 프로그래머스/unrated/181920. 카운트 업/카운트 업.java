class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] arr = new int[end_num - start_num + 1];
        int count = 0;
        
        for(int i = start_num; i <= end_num; i++) {
            arr[count] = i;
            count++;
        }
        
        return arr;
    }
}