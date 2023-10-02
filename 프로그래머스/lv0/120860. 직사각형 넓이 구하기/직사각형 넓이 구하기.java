class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] xArr = new int[dots.length];
        int[] yArr = new int[dots.length];
        
        for(int i = 0; i < dots.length; i++) {
            xArr[i] = dots[i][0];
            yArr[i] = dots[i][1];
        }
        
        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;

        for(int i = 0; i < xArr.length; i++) {
            xMax = Math.max(xMax, xArr[i]);
            yMax = Math.max(yMax, yArr[i]);
            xMin = Math.min(xMin, xArr[i]);
            yMin = Math.min(yMin, yArr[i]);
        }
        
        int x, y = 0;
        x = xMax - xMin;
        y = yMax - yMin;
        
        answer = x * y;
        
        return answer;
    }
}