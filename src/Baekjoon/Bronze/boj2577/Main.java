package Baekjoon.Bronze.boj2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 자연수(정수) A,B,C 가 주어진다
         * 2. A*B*C 한 결과에 0부터 9까지 숫자가 몇 번씩 쓰였는지 구하기 (배열 사용)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String result = String.valueOf(A*B*C); // "17037300"

        int[] resultIndex = new int[10]; // resultIndex = [0,0,0,0,0,0,0,0,0,0]

        for (int i = 0; i < result.length(); i++) {
            int tmp = result.charAt(i) - 48; // char 0은 int 48이다
            resultIndex[tmp] += 1;
        }

        for (int j = 0; j < resultIndex.length; j++) {
            System.out.println(resultIndex[j]);
        }

    }
}


