package Baekjoon.Silver.boj_2018;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. N을 입력받고 배열 선언
         * 2. 투포인터로 end = N 까지 작성
         *
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }


        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;

        while (end <= N) {
            if (sum < N) {
                if (end == N) break;
                sum += arr[end];
                end++;
            }else if(sum > N){
                sum -= arr[start];
                start++;
            }else{
                count++;
                sum -= arr[start];
                start++;

            }
        }
        System.out.println(count);


    }
}

