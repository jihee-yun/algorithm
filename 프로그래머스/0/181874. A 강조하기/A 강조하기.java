class Solution {
    public String solution(String myString) {
        String[] arr = myString.split("");
        String answer = "";
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase("a")) {
                answer += arr[i].toUpperCase();
            } else answer += arr[i].toLowerCase();
        }
        return answer;
    }
}