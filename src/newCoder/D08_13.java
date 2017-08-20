package newCoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class D08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            String arr[] = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.next();
            }

            Arrays.sort(arr, new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    return (o1 + o2).compareTo(o2 + o1);
                }
            });

            for (int i = 0; i < n; i++) {
                System.out.print(arr[n - i - 1] + " ");
            }
        }
    }

    //947 946 93 93 936 860 82 821 7727587256726664963660859057255453552352241339937934431330729291210204184178153123115
    //947 946 936 93 93 860 821 82 7727587256726664963660859057255453552352241339937934431330729129210204184178153123115
}
