package Baekjoon.Bronze.boj_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 정수 T 가 주어진다
         * 2. T회 반복해서 R(반복횟수) S(문자열) 을 공백으로 구분되어 입력받는다
         * 3. T횟수만큼 S문자열을 R회 반복해서 출력한다
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int j = 0; j < S.length(); j++) {
                for (int z = 0; z < R; z++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();

        }


    }
}