import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr = new int[a][b];
        int[][] arr2 = new int[a][b];
        int[][] arr3 = new int[a][b];

        // 입력 받기
        for (int j = 0; j < a; j++) {
            for (int k = 0; k < b; k++) {
                arr[j][k] = sc.nextInt();
            }
        }

        for (int j = 0; j < a; j++) {
            for (int k = 0; k < b; k++) {
                arr2[j][k] = sc.nextInt();
            }
        }

        // 덧셈 연산 및 결과 출력
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
