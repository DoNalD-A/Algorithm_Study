package Baekjoon.Silver.boj_1312;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int result = 0;

        //나눗셈은 나누고 남은 나머지에 *10을 해주고 다시 나눠주는 것을 반복하는 연산이다.
        for(int i = 0; i < N; i++) {
            A = (A % B) * 10;
            //내가 구해야 할 값은 N번째 몫이기 때문에 몫은 따로 저장해준다.
            result = A / B;
        }
        System.out.println(result);
    }

}
