public class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;

        // arr1의 원소 합 구하기
        for (int num : arr1) {
            sum1 += num;
        }

        // arr2의 원소 합 구하기
        for (int num : arr2) {
            sum2 += num;
        }

        // 두 배열의 길이와 원소 합 비교하여 대소관계 판별
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            return Integer.compare(sum1, sum2);
        }
    }
}
