package Baekjoon.Bronze.boj_2869;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 총 높이 / 하루 올라갈 수 있는 높이로 바로 계산 가능
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
