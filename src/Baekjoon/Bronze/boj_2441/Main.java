package Baekjoon.Bronze.boj_2441;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. */
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= N - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
