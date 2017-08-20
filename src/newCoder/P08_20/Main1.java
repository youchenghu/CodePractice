package newCoder.P08_20;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int n = input.nextInt();
            int[][] tree = new int[n][2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    tree[i][j] = -1;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                int parent = input.nextInt();
                int child = input.nextInt();
                if (tree[parent][0] == -1) tree[parent][0] = child;
                else if (tree[parent][1] == -1) tree[parent][1] = child;
            }
            System.out.println();
            System.out.println(height(0, tree));

        }
    }

    private static int height(int root, int[][] tree) {
        int left = tree[root][0];
        int right = tree[root][1];
        if (left == -1 && right == -1) return 1;
        if (left == -1) return height(right, tree) + 1;
        if (right == -1) return height(left, tree) + 1;
        else return Math.max(height(left, tree), height(right, tree)) + 1;
    }
}
