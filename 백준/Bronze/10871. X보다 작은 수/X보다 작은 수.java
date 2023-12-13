import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int e : arr) {
            if(e < x) list.add(e);
        }

        for(int e : list) {
            System.out.print(e + " ");
        }
    }
}