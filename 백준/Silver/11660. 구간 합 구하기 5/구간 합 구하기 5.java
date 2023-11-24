import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] arr2 = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                arr2[i][j] = arr2[i][j - 1] + arr2[i - 1][j] - arr2[i - 1][j - 1] + arr[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int sum = arr2[c][d] - arr2[a - 1][d] - arr2[c][b - 1] + arr2[a - 1][b - 1];
            System.out.println(sum);
        }
    }
}
