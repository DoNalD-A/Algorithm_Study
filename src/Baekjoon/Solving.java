package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solving {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 공백의 갯수 출력
         * 2. StringToken 갯수 반환
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        System.out.println(st.countTokens());


    }
}

