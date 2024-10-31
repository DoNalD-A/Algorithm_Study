package Baekjoon.Bronze.boj_2292;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. int N 입력받기
         * 2. Layer Max값, Layer수 변수로 선언
         * 3. 반복문으로 N <= LayerMax 인 경우 계속 찾기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1
        int N = Integer.parseInt(br.readLine());

        // 2
        int layerMax = 0;
        int layer = 1;

        //3
        while (true) {
            if (N - 1 <= layerMax) {
                System.out.println(layer);
                break;
            } else {
                layerMax += layer * 6;
                layer++;

            }
        }

    }
}
