package com.ll.수학.p2960;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> num = new ArrayList<>();
        for(int i = 2; i <= N; i++) {
            num.add(i);
        }

        int start = 2;
        int cnt = 0;

        while(true) {
            num.remove(0);
            cnt++;

            if(cnt == K) {
                System.out.println(start);
                return;
            }

            for(int i = start * 2; i <= N; i += start){
                if(!num.contains(i)) continue;

                num.remove(num.indexOf(i));
                cnt++;

                if(cnt == K) {
                    System.out.println(i);
                    return;
                }
            }

            start = num.get(0);
        }
    }
}
