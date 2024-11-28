package Baekjoon;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 4 2 3
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        // 3 2 4 5
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(arr[D-1]*N + (X-D));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int D = sc.nextInt();
            int X = sc.nextInt();
            int[] arr = new int[N];

//            StringTokenizer st = new StringTokenizer(sc.next(), " ");
//            for (int i = 0; i < arr.length; i++) {
//                //while (st.hasMoreTokens()) {
////                arr[i] = Integer.parseInt(st.nextToken());
//                arr[i] = Integer.parseInt(st.nextToken());

            String tmp = sc.next();
            for (int i = 0; i < tmp.length(); i += 2) {
                arr[i] = Integer.parseInt(tmp.charAt(i) - '0');
            }


            System.out.println("#" + test_case); //arr[D - 1] * N + (X - D));
            System.out.println(arr[D - 1] * N + (X - D));
        }
    }
}




/*
class Solution
{
 public static void main(String args[]) throws Exception
 {
   System.out.println("Hello World");
 }
}
 */