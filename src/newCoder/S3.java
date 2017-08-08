package newCoder;

import java.util.Scanner;

/**
 * Created by happy-you on 17-8-8.
 */
public class S3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        int result = s.length();
        for (int i = 2; i < s.length(); i++) {
            String sub = s.substring(0, s.length() - i);
            if(isEvenString(sub)){
                result = s.length() - i;
                break;
            }
        }

        System.out.println(result);
    }

    private static boolean isEvenString(String s){
        int n = s.length();
        if(((n >> 1)<<1) != n){
            return false;
        }
        else{
            for (int i = 0; i < n / 2; i++) {
                if(s.charAt(i) != s.charAt(n / 2 + i)) return false;
            }
        }
        return true;
    }
}
