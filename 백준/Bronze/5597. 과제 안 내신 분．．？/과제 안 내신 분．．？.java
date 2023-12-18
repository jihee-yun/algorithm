import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[31];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = 0;
        }

        for(int i = 1; i <= 28; i++) {
            int num = sc.nextInt();
            arr[num] = 1;
        }

        int[] arr2 = new int[2];

        int index = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == 0) {
                arr2[index] = i;
                index++;
            }
        }

        Arrays.sort(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
}