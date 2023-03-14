package jinyeong.q10250;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int tx = sc.nextInt();
        int answer = 0;
        for(int i=0; i<tx; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            if(N%H==0){
                answer = H*100 + (N/H);
            }else {
                answer = (N%H)*100 + (N/H+1);
            }

            System.out.println(answer);
        }
        sc.close();
    }
}
