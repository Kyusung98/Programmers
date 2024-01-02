package com.example.programmers.lv0;

import java.util.Arrays;

public class Solution_day13 {
    //문자열 my_string이 매개변수로 주어질 때,
    //my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
    public int[] solution(String my_string) {

        String[] s = my_string.replaceAll("[a-z]","").split("");
        Arrays.sort(s);

        int[] answer = new int[s.length];

        for (int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(s[i]);
        }
        return answer;
    }

}
