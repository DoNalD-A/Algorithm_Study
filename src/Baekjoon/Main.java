package Baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 카드 개수 N, 가까운 합 M 입력 받기
         * 2. 배열 입력받아 저장
         * 3. 3중 for문으로 NC3(조합) 모든 경우의 수 다 구해서 Hashset에 저장
         * 4. 합이 M을 넘지 않는 가장 가까운 값 출력
         */

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //3
        HashSet<Integer> sum = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int z = j + 1; z < arr.length; z++) {
                    sum.add(arr[i] + arr[j] + arr[z]);
                }
            }
        }

        //4
        int max = 0;
        for (int tmp : sum) {
            if (tmp <= M) {
                if (M - tmp < M - max) {
                    max = tmp;
                }
            }
        }
        System.out.println(max);
    }
}
