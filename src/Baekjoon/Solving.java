package Baekjoon;

import java.util.*;
import java.io.*;

public class Solving {
    public static void main(String[] args) throws IOException {
        /*
         * 백준 1253번
         * -> 음수 포함한 코드로 수정해보기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);


        int goodIndex = arr.length - 1;
        int count = 0;

        //첫번째 for문 -> goodIndex 끝 인덱스부터 차례로 -1 하기
        for (int i = 0; i < arr.length - 1; i++) {
            int start = 0;
            int end = goodIndex - 1;

            //투 포인터로 사이값 중 2개 합==goodIndex 있는지 찾기
            while (start < end) {
                if ((long)arr[start] + arr[end] < arr[goodIndex]) {
                    start++;
                } else if ((long)arr[start] + arr[end] > arr[goodIndex]) {
                    end--;
                } else {
                    count++;
                    break;
                }
            }
            goodIndex--;

        }
        System.out.println(count);

    }
}




















