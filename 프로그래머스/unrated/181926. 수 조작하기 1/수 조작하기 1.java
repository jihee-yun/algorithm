class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        int tmp = n;
        String[] arr = control.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("w")) {
                tmp = tmp + 1;
            } else if(arr[i].equals("s")) {
                tmp = tmp - 1;
            } else if(arr[i].equals("d")) {
                tmp = tmp + 10;
            } else tmp = tmp - 10;
        }
        return answer = tmp;
    }
}