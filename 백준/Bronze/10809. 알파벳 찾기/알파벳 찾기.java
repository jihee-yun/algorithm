import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for(int i = 0; i < word.length(); i++) {
            char now = word.charAt(i);

            if (arr[now - 'a'] == -1) {
                arr[now - 'a'] = i;
            }
        }

        for(int e : arr) {
            System.out.print(e + " ");
        }

    }
}