package com.example.programmers.lv0;

public class Solution_day23 {
    //문자열 my_string이 매개변수로 주어질 때,
    //대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++){
            char c =my_string.charAt(i);
            if (c >= 'a' && c <= 'z'){
                c -= 32;
            }else {
                c += 32;
            }
            answer += c;
        }
        return answer;
    }
}
