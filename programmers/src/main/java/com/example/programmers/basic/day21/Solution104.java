package com.example.programmers.basic.day21;

public class Solution104 {
    //한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
    public int solution(String num_str) {
        int answer = 0;
        for (String s : num_str.split("")){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
