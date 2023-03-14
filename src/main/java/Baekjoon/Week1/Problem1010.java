package Baekjoon.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        int[][] arr = new int[30][30];
        arr[0][0] = 1;

        for (int i = 1; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                if (j == 0) {
                    arr[i][j] = 1;
                    continue;
                }
                if (i == j) {
                    arr[i][j] = 1;
                    continue;
                }

                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            System.out.println(arr[M][N]);
        }

        
    }
}
