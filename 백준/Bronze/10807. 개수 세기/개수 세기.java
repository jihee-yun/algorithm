import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        int v = sc.nextInt();

        for(int e : arr) {
            if(e == v) count++;
        }

        System.out.println(count);
    }
}