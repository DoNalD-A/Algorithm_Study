package Baekjoon.Bronze.boj_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. N개 입력받기
         * 2. int[N] 배열 선언하기
         * 3. StringToken으로 받아서 배열에 담아 for-each 문으로 최소값, 최대값 찾기 (한 반복문에서 둘 다)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //배열에 값 할당
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);

    }
}

