package Baekjoon.Silver.boj_1940;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 재료의 개수 N, 필요한 수의 합 M 입력받기
         * 2. 수 입력받아 배열에 넣기(sort or 넣으면서 정렬)
         * 3. 투 포인터(각 포인터를 최소,최대값으로 설정)를 사용해 M값 하기
         * 3-1. count = 0, sum = 0, start = 0, end = N
         * 3-2. 종료조건: start==end
         * 3-3. sum < M, sum == M, sum > M -> 3가지로 생각
         * 4. cou t 출력
         */

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        //2
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        //3
        int count = 0;
        int start = 0;
        int end = N-1;

        //'고유한' 정수(중복 없기 때문에 start < end)
        while (start < end) {
            if (arr[start] + arr[end] < M) {
                start++;
            } else if (arr[start] + arr[end] > M) {
                end--;
            }else{
                //'고유한' 정수(중복 없기 대문에 start, end 둘 다 변화하기)
                count++;
                start++;
                end--;
            }
        }

        System.out.println(count);

    }
}