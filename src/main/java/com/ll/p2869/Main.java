package com.ll.p2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int up = sc.nextInt();
        int down = sc.nextInt();
        int goal = sc.nextInt();

        int result = (goal - down) / (up - down);
        int rest = (goal - down) % (up - down);

        if (rest != 0) {
            result++;
        }
        System.out.println(result);
    }
}
