import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a != 0 && b != 0) {
                list.add(a + b);
            } else break;
        }

        for(Integer e : list) {
            System.out.println(e);
        }
    }
}