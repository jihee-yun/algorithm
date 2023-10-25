import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        String str = "";
        
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);
            if (Character.isLowerCase(c)) {
                str += Character.toUpperCase(c);
            } else {
                str += Character.toLowerCase(c);
            }
        }
        System.out.print(str);
    }
}