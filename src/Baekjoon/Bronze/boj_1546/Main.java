package Baekjoon.Bronze.boj_1546;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 과묵 개수 (정수)N 입력받기
         * 2. 점수 N개 공백 기준으로 입력받기 + 배열 선언
         * 3. 점수 중 최대 값 M 찾기
         * 4. 점수 / M*100을 한 평균 구하기
         */

        //1번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];

        //2번
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        //3번
        double M = 0;
        for(int score: scores){
            if (score > M) {
                M = score;
            }
        }

        //4번 scores = {40,80,60}, M=80
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += (scores[i] / M)*100;
        }
        //50, 100, 75

        double average = sum / N;

        System.out.println(average);



    }
}

