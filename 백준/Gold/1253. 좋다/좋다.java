import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // arr 배열 정렬

        for(int k = 0; k < n; k++) {
            int find = arr[k];
            int i = 0;
            int j = n - 1;

            while(i < j) {
                if(arr[i] + arr[j] == find) {
                    if(i != k && j != k) {
                        result++;
                        break;
                    } else if(i == k) {
                        i++;
                    } else if(j == k) {
                        j--;
                    }
                } else if(arr[i] + arr[j] < find) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
