import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int oven = sc.nextInt();
        int time = (h * 60) + m + oven;

        int resultHour = (time / 60) % 24;

        System.out.println(resultHour + " " + time % 60);
    }
}