class Solution {
    public String solution(int age) {
        String answer = "";
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        if(age > 9 && age < 100) {
            answer = arr[age / 10] + arr[age % 10];
        }
        else if(100 <= age && age < 1000) {
            answer = arr[(age / 10) / 10] + arr[(age / 10) % 10] + arr[age % 10];
        } else if(age == 1000) {
            answer = arr[((age / 10) / 10) / 10] + arr[((age / 10) / 10) % 10] + arr[(age / 10) % 10] + arr[age % 10];
        } else if(age < 10) answer = arr[age % 10];
        
        return answer;
    }
}