package Baekjoon;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 높이 V, 올라갈 높이 A, 미끄러지는 높이 B 입력 받기
         * 2. day N 현재 높이: (A*N) - (B*(N-1))
         * 2-1. 2번에서 구한 변수(presnetHeight) >= V인 경우 탈출하는 while문 탈출
         */

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

//        int count = 1;
//        int day = A-B;
//        int goal = V-A;
//
//        int daySum = goal / day;
//        if (goal % day != 0) {
//            daySum++;
//        }
//        System.out.println(count+daySum);

        int climbPerDay = A - B;
        int remainingHeight = V - A;
        int dayRequired = remainingHeight / climbPerDay;

        if (remainingHeight % climbPerDay != 0) {
            dayRequired++;
        }
        //첫 날 올라간 A만큼 미리 계산했기 때문에 +1 해주기
        System.out.println(dayRequired + 1);


    }
}
