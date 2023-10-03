class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int xMax = (board[0] ) / 2;
        int yMax = (board[1] ) / 2;
        
        for (String input : keyinput) {
            switch (input) {
                case "left":
                    answer[0] -= 1;
                    break;
                case "right":
                    answer[0] += 1;
                    break;
                case "up":
                    answer[1] += 1;
                    break;
                case "down":
                    answer[1] -= 1;
                    break;
            }
            
            if (answer[0] > xMax) {
                answer[0] = xMax;
            } else if (answer[0] < -xMax) {
                answer[0] = -xMax;
            }
            
        
            if (answer[1] > yMax) {
                answer[1] = yMax;
            } else if (answer[1] < -yMax) {
                answer[1] = -yMax;
            }
        }
        
        return answer;
    }
}