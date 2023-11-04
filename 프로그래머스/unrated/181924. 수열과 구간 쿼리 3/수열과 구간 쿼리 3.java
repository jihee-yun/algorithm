class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // int[] answer = new int[arr.length];
        int tmp = 0;
        int tmp2 = 0;
        int tmp3 = 0;
        
        for(int i = 0; i < queries.length; i++) {
            tmp = queries[i][0];
            tmp2 = queries[i][1];
            
            tmp3 = arr[tmp];
            arr[tmp] = arr[tmp2];
            arr[tmp2] = tmp3;
            
        }
        
        return arr;
    }
}