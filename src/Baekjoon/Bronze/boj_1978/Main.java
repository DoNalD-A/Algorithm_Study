package Baekjoon.Bronze.boj_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 테스트 케이스 개수 '정수' N 주어짐
         * 2. 공백을 기준으로 수를 입력받고, 소수의 개수 출력하기
         * 3. 각 수 T를 1~T로 나누고, 나머지가 0인 수가 2개 -> 소수로 판별 (remain을 2로 설정하고 0이 되면 반복문 종료(?)
         */

//        1번. 전부
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int count = 0;
//        for (int n = 0; n < N; n++) {
//
//            int T = Integer.parseInt(st.nextToken());
//            int remain = 0;
//
//            for (int i = 1; i <= T; i++) {
//                if (T % i == 0) {
//                    remain++;
//                }
//            }
//            if (remain == 2) {
//                count++;
//            }
//        }
//        System.out.println(count);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        for (int n = 0; n < N; n++) {

            int T = Integer.parseInt(st.nextToken());
            int remain = 2;

            for (int i = 1; i <= T; i++) {
                if (T % i == 0) {
                    remain--;
                    if (remain < 0) {
                        break;
                    }
                }
            }
            if (remain == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}