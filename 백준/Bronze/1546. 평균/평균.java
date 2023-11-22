import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] score = new Double[n];
        double sum = 0;
        double avg = 0;

        for(int i = 0; i < n; i++) {
            score[i] = sc.nextDouble();
        }

        Arrays.sort(score, Collections.reverseOrder());
        double tmp = score[0];

        for(int i = 0; i < n; i++) {
            score[i] = (score[i] / tmp) * 100;
            sum += score[i];
        }

        avg = sum / n;
        System.out.println(avg);

    }
}
