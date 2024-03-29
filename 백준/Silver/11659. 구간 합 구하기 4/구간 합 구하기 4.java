import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] sumArr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            sumArr[i] = sumArr[i - 1] + sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(sumArr[b] - sumArr[a - 1]);
        }
    }
}
