import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();

            sum += price * count;
        }

        if(total == sum) {
            System.out.print("Yes");
        } else System.out.print("No");
    }
}