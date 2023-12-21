import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[42];

        for(int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int result = num % 42;
            arr[result] += 1;
        }

        int count = 0;
        for(int e : arr) {
            if(e != 0) {
                count++;
            }
        }

        System.out.print(count);
    }
}