package Baekjoon.Bronze.boj_2562;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. max값이 갱신되면 index값 반환
         **/

        Scanner sc = new Scanner(System.in);

        int count = 1;
        int index = -1;
        int max = -1;

        for (int i = 0; i < 9; i++) {
            int tmp = sc.nextInt();
            if (tmp > max) {
                max = tmp;
                index = count;
            }
            count++;
        }

        System.out.println(max);
        System.out.println(index);

    }
}

