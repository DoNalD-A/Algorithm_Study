package Baekjoon.Bronze.boj_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //하얀칸 위에 말의 수를 저장 할 변수
        int result = 0;

        for(int i = 0; i < 8; i++) {
            String S = br.readLine();

            for(int j = 0; j < 8; j++) {
                //짝수 짝수 일때 말이 오면 result +1
                if(i % 2 == 0) {
                    if(j % 2 == 0) {
                        if(S.charAt(j) == 'F') result++;
                    }
                    //홀수 홀수 일때 말이 오면 result +1
                }else {
                    if(j % 2 != 0) {
                        if(S.charAt(j) == 'F') result++;
                    }
                }
            }
        }
        System.out.println(result);
    }

}
