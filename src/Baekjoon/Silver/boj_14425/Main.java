package Baekjoon.Silver.boj_14425;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         * 1. N개 입력받아 HashSet에 저장
         * 2. M번 입력받으며 .contains == true면 count++ 해주고 출력
         */

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        // 2
        for (int i = 0; i < M; i++) {
            String word = br.readLine();
            if (set.contains(word)) {
                count++;
            }
        }
        System.out.println(count);



    }
}
