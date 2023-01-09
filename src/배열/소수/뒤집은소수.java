package 배열.소수;

import java.util.Arrays;
import java.util.Scanner;

public class 뒤집은소수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = Integer.parseInt(new StringBuilder(scanner.next()).reverse().toString());
        }
        뒤집은소수.solution(n, ints);

    }

    private static void solution(int n, int[] ints) {
        Arrays.stream(ints).filter(뒤집은소수::isPrime).forEach(System.out::println);

    }

    public static boolean isPrime(int num) {

        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
