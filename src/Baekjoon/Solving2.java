package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solving2 {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 0 0 0이 올 때까지 계속 입력받기
         * 2. 가장 큰 정수^2 = 나머지1^2 + 나머지2^2 ? 'right' : 'wrong'
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                break;
            }


            int[] arr = {a, b, c};
            Arrays.sort(arr);

            if (arr[2] * arr[2] == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
}