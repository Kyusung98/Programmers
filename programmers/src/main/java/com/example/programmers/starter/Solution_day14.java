package com.example.programmers.starter;

public class Solution_day14 {
    //문자열 my_string이 매개변수로 주어집니다.
    //my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
    public int solution(String my_string) {
        int answer = 0;
        
        String[] s = my_string.replaceAll("[^0-9]", "").split("");
        for(int i = 0; i < s.length; i++){
            answer += Integer.parseInt(s[i]);
        }
        return answer;
    }
}
