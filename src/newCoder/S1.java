package newCoder;

import java.util.Scanner;

public class S1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String color = input.next();

        int result=0;
        for (int i = 0; i < color.length() - 1; ) {
            if(color.charAt(i) == color.charAt(i+1)){
                result++;
                i+=2;
            }
            else{
                i++;
            }
        }

        System.out.println(result);
    }
}
