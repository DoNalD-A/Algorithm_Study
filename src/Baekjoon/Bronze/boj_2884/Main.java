package Baekjoon.Bronze.boj_2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. H,M 입력받아 M으로 통일하기
         * 2. M - 45 하기
         * 3. 값이 음수이면 + 24*60(1440) 해주기
         * 4. H, M 형태로 출력하기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int totalMinutes = 60*H + M;

        int lastMinutes = totalMinutes - 45;

        if (lastMinutes < 0) {
            lastMinutes += 1440;
        }

        int Hour = lastMinutes / 60;
        int Minutes = lastMinutes % 60;

        System.out.print(Hour + " " + Minutes);

    }
}

