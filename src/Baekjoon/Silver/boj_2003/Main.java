package Baekjoon.Silver.boj_2003;

import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 배열 개수N, 구해야하는 합M 입력받기
         * 2. 크기 N배열 선언하고, 입력 받기
         * 2. index=0 부터 ++ 하면서 sum >= M 이면 index=1 부터 다시 시작
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 3
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == M){
                    count ++;
                    break;
                }else if(sum > M){
                    break;
                }
            }
        }

        System.out.println(count);


    }
}
