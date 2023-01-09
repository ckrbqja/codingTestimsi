package 배열.피보나치;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main.solution(scanner.nextInt());
    }

    private static void solution(int n) {

        int[] result = new int[n];
        result[0] =1; result[1] = 1;
        int a = 1, b = 1;
        for (int i = 2; i < n; i++) {
            int tmp = a + b;
            result[i] = tmp;
            a = b;
            b = tmp;
        }

        Arrays.stream(result).forEach(System.out::print);
    }
}
