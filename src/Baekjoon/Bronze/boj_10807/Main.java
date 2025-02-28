package Baekjoon.Bronze.boj_10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer strtk = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            if(Integer.parseInt(strtk.nextToken())==x)
                count++;
        }
        System.out.println(count);
        br.close();
    }
}
