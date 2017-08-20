package newCoder;

import java.util.Scanner;

public class D08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, k, d;
        n = input.nextInt();
        long arr[] = new long[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i + 1] = input.nextInt();
        }

        k = input.nextInt();
        d = input.nextInt();

        long dpMax[][] = new long[n + 1][k + 1];
        long dpMin[][] = new long[n + 1][k + 1];

        long ans = 0;

        for (int i = 1; i <= n; i++) {
            // 以i为最后一个，选1个的情况
            dpMax[i][1] = arr[i];
            dpMin[i][1] = arr[i];

            // 选两个以上的情况
            for (int j = 2; j <= k; j++) {

                // 迭代更新最大值／最小值，但是相邻两者编号不能超过d
                for (int l = i - 1; l >= Math.max(i - d, 1) ; l--) {
                    dpMax[i][j] = Math.max(dpMax[i][j], Math.max(dpMax[l][j - 1] * arr[i], dpMin[l][j - 1] * arr[i]));
                    dpMin[i][j] = Math.min(dpMin[i][j], Math.min(dpMax[l][j - 1] * arr[i], dpMin[l][j - 1] * arr[i]));
                }
            }

            ans = Math.max(ans, Math.max(dpMax[i][k], dpMin[i][k]));
        }

        System.out.println(ans);
    }
}
