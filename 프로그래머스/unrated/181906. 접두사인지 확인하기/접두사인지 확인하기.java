class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] arr = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            arr[i] = my_string.substring(0, i + 1);
        }
        
        for(String e : arr) {
            if(e.equals(is_prefix)) {
                answer = 1;
                break;
            } else answer = 0;
        }
        return answer;
    }
}