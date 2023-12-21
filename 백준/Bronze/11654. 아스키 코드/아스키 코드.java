import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char ascii = a.charAt(0);

        System.out.print(ascii - 0);

    }
}