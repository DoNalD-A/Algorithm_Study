package Baekjoon.Bronze.boj_8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 테스트 케이스 개수 '정수'N이 주어진다
         * 2. 'OX'로 이루어진 문자열 S 입력받는다.
         * 3. 정답, 누적 합, if(s.charAt(i) == 'O' 로 계산
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++) {
            String s = br.readLine();
            int answer = 0;
            int tmpAdd = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'O') {
                    answer += tmpAdd;
                    tmpAdd++;
                }else{
                    tmpAdd = 1;
                }
            }
            System.out.println(answer);
        }


    }
}