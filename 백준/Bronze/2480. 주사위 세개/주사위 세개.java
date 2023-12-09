import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        if (arr[0] == arr[2]) {
            System.out.print(10000 + arr[0] * 1000);
        } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
            System.out.print(1000 + arr[1] * 100);
        } else {
            System.out.print(arr[2] * 100);
        }
    }
}