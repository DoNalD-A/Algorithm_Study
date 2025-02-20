package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 통화 개수 입력받아 배열에 삽입
         * 2. ''초' / 30(60) 값 + 1 * 요금' 비교하기*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int Y = 0;
        int M = 0;

        for (int time : arr) {
            Y += ((time / 30) + 1) * 10;
            M += ((time / 60) + 1) * 15;
        }

        if (Y > M) {
            System.out.print("Y " + Y);
        }
        if (M > Y) {
            System.out.print("M " + M);
        }

    }
}
