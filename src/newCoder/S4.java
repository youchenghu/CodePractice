package newCoder;

import java.util.Scanner;

/**
 * Created by happy-you on 17-8-8.
 */
public class S4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        // 统计有多少个个数为奇数的字母，如果为0或者1，则至少构成1个回文串
        // 如果>1,则有几个个数为奇数的字母，就至少有几个回文串

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            arr[index]++;
        }

        int oddNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1) oddNum++;
        }

        if(oddNum <= 1) System.out.println(1);
        else System.out.println(oddNum);
    }
}
