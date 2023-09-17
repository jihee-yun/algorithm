class Solution {
    public int solution(int i, int j, int k) {
        String a = String.valueOf(k);
        int count = 0;
       
        for (int num = i; num <= j; num++) {
            String numStr = String.valueOf(num);
            if (numStr.contains(a)) {
                String[] arr = numStr.split("");
                for(String e : arr) {
                    if(e.equals(a)) {
                        count++;
                    }
                }
            }
            
        }
        
        return count;
    }
}