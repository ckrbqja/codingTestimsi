package 배열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ints = new int[2][n];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                ints[i][j] = scanner.nextInt();
            }
        }
        Main.solution(n, ints);
    }

    private static void solution(int n, int[][] ints) {
        String result = "D";
        for (int i = 0; i < n; i++) {
            int a = ints[0][i];
            int b = ints[1][i];


            result = a - b == 1 || a - b == -2 ? "A" : "B";

            if (a == b) result = "D";


            System.out.println("result = " + result);
        }

    }
}
