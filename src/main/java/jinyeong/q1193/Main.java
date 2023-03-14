package jinyeong.q1193;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader 사용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());

        //Scanner 사용
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(new Solution().solution(n));

    }
}

class Solution{
    public String solution(int n){
        int diagonal = 1; // 대각선의 수
        int count = 0;  // 전체 칸의 수

        int num = 0;    // 분자
        int deno = 0;   // 분모

        while(true){
            if(n <= diagonal + count){
                if(diagonal % 2 == 0){  // 대각선 번호가 짝수
                    num = n - count;
                    deno = diagonal - (n-count-1);
                    break;
                } else{             // 대각선 번호가 홀수
                    num = diagonal - (n-count-1);;
                    deno = n - count;
                    break;
                }
            }else{
                count += diagonal;
                diagonal++;
            }
        }
        return (num  + "/" + deno);
    }
}