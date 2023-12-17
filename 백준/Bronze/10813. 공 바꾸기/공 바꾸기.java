import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for(int a = 0; a < m; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int tmp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = tmp;
        }

        for(int e : arr) {
            System.out.print(e + " ");
        }
    }
}
