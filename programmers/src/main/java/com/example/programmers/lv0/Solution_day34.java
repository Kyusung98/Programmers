package com.example.programmers.lv0;

public class Solution_day34 {
    //정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);

        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        return answer;
    }

}
