package programmers.Lv0.문자열_곱하기;

class Solution {
    public String solution(String my_string, int k) {

        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }

        return answer;
    }
}
