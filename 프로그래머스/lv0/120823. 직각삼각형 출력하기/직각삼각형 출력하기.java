import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;

        for(int i = 1; i <= n; i++) {
          for(int j = 0; j < count; j++) {
              System.out.print("*");
          }
            System.out.println();
            count++;
        }
    }
}