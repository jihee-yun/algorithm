import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String plus = "";


        for(int i = 1; i < n / 4; i++) {
            plus += "long ";
        }

        System.out.print(plus + "long int");
    }
}