class Solution {
    public int solution(String num_str) {
        String[] arr = num_str.split("");
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
            
        }
        return sum;
    }
}