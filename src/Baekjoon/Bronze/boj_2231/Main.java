package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 자연수 N을 입력받는다
         * 2. N의 합성수를 출력한다, 값이 존재하지 않으면 '0' 출력
         * 3. 자연수 N이 n자리수 -> N-(n*9) <= tmp <= N  범위에서 찾아보기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = input.length(); //n자리수
        int N = Integer.parseInt(input);

        int minRange = N - (n * 9);
        int answer = 0;

        for (int i = N - (n * 9); i <= N; i++) {
            int sum = i;
            int tmp = i;

            //각 자리수 합 계산
            while (tmp > 0) {
                sum += tmp % 10;
                tmp = tmp / 10;
            }

            //생성자 확인
            if (sum == N) {
                answer = i;
                break;
            }
        }

        //생성자가 존재하지 않으면 초기 값 '0' 출력
        System.out.println(answer);

    }
}
