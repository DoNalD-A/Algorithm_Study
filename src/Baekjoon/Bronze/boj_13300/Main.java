package Baekjoon.Bronze.boj_13300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 학생 수 N과 한 방에 배정할 수 있는 최대 인원 수 K 입력
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 성별과 학년에 따른 배열 초기화
        // arr[0]: 여학생, arr[1]: 남학생
        // 배열의 두 번째 차원은 학년을 나타냄
        int[][] arr = new int[2][6];

        // 학생 정보 입력 및 배열에 저장
        for (int i = 0; i < n; i++) {
            input = br.readLine();
            st = new StringTokenizer(input);

            int s = Integer.parseInt(st.nextToken()); // 성별
            int y = Integer.parseInt(st.nextToken()); // 학년

            arr[s][y-1]++; // 해당 성별, 학년에 인원 추가
        }

        int ans = 0;
        // 각 성별과 학년에 대해 필요한 방의 수 계산
        for (int s = 0; s < 2; s++) {
            for (int y = 0; y < 6; y++) {
                // 해당 성별, 학년의 인원을 최대 인원 수로 나누어 올림한 값을 더함
                ans += Math.ceil((double)arr[s][y] / (double)k);
            }
        }

        // 결과 출력
        sb.append(ans);
        System.out.print(sb);
    }
}