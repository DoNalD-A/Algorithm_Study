package programmers.Lv0.홀짝_구분하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.print(n + " is even");
        }else{
            System.out.print(n + " is odd");
        }

    }
}