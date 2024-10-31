package Baekjoon.Silver.boj_11659;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        /*
         * 1. 수의 개수N, 합의 횟수 M을 입력 받는다
         * 2. N개를 차례로 입력받아 합배열 s에 저장하기
         * 3. M회 구해야하는 구간합을 입력받는다 j번째 - i번째 출력하기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2
        int[] sumArr = new int[N];
        int tmp = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < sumArr.length; i++) {
            tmp += Integer.parseInt(st.nextToken());
            sumArr[i] = tmp;
        }

        // 3
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int finish = Integer.parseInt(st.nextToken());
            if(start == 1){
                System.out.println(sumArr[finish-1]);
            }else{
                System.out.println(sumArr[finish-1] - sumArr[start-2]);
            }

        }

    }
}
