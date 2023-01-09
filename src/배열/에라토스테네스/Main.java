package 배열.에라토스테네스;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main.solution(scanner.nextInt());
    }

    private static void solution(int n) {
        int answer = 0;
        int[] a = new int[n + 1];

        for (int i = 2 ; i <= n; i++) {
            if(a[i]==0){
                answer++;
                for (int j = i; j <= n; j = j + i) a[j] = i;
            }
        }
        System.out.println(answer);
    }
}
