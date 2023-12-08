import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int alarm = (h * 60) + m - 45;

        if (alarm < 0) {
            alarm += 24 * 60; 
        }

        System.out.println(alarm / 60 + " " + alarm % 60);
    }
}