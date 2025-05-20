package Baekjoon.Bronze.boj_1173;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int count = 0;
        int n = 0;
        int temp = m;
        while(true) {
            if(M-m<T) {
                count = -1;
                break;
            }
            if(temp+T<=M) {
                temp += T;
                n++;
                count++;
            }else {
                if(temp-R>m) {
                    temp -= R;
                    count++;
                }else {
                    temp = m;
                    count++;
                }
            }
            if(n==N)break;
        }
        System.out.println(count);
    }
}
