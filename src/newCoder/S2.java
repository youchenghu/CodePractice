package newCoder;

import java.util.Scanner;

/**
 * Created by happy-you on 17-8-8.
 */
public class S2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        int maxDNALength = 0;

        int currLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (isDNA(a)) {
                currLength++;
            } else {
                if (currLength > maxDNALength) maxDNALength = currLength;
                currLength = 0;
            }
        }

        System.out.println(maxDNALength);
    }

    private static boolean isDNA(char a) {
        if (a == 'A' || a == 'T' || a == 'G' || a == 'C') {
            return true;
        }
        return false;
    }
}
