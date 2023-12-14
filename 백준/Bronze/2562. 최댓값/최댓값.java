import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int num = 1; 

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                num = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(num);
    }
}
