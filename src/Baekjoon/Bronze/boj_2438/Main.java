package Baekjoon.Bronze.boj_2438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
