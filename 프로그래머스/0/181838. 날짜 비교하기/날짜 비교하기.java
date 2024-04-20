public class Solution {
    public int solution(int[] date1, int[] date2) {
        // date1의 연도, 월, 일을 각각 가져옵니다.
        int year1 = date1[0];
        int month1 = date1[1];
        int day1 = date1[2];

        // date2의 연도, 월, 일을 각각 가져옵니다.
        int year2 = date2[0];
        int month2 = date2[1];
        int day2 = date2[2];

        // date1과 date2를 비교하여 결과를 반환합니다.
        if (year1 < year2 || (year1 == year2 && month1 < month2) || (year1 == year2 && month1 == month2 && day1 < day2)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] date1 = {2023, 4, 13};
        int[] date2 = {2023, 4, 14};
        System.out.println(solution.solution(date1, date2)); // 결과 출력
    }
}
