package Baekjoon.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1963 {
    private static Queue<Integer> queue;
    private static boolean[] visited;
    private static int[] count;
    private static boolean[] isPrime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        isPrime = new boolean[10000];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;


        for (int i = 2; i < 10000; i++) {
            for (int j = i * 2; j < 10000; j += i) {
                if (isPrime[j]) {
                    isPrime[j] = false;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int primeA = Integer.parseInt(st.nextToken());
            int primeB = Integer.parseInt(st.nextToken());

            if (primeA == primeB) {
                System.out.println(0);
                continue;
            }

            visited = new boolean[10000];
            count = new int[10000];
            visited[primeA] = true;
            queue = new LinkedList<>();
            queue.add(primeA);
            findPrime();
            if (count[primeB] == 0) {
                System.out.println("Impossible");
                continue;
            }

            System.out.println(count[primeB]);
        }
    }

    private static void findPrime() {

        while (!queue.isEmpty()) {

            int prime = queue.poll();

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    int changePrime = change(prime, i, j);
                    if (isPrime[changePrime] && !visited[changePrime]) {
                        queue.add(changePrime);
                        visited[changePrime] = true;
                        count[changePrime] = count[prime] + 1;
                    }
                }
            }
        }
    }

    private static int change(int num, int i, int j) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.setCharAt(i, (char) (j + '0'));
        return Integer.parseInt(sb.toString());
    }
}
