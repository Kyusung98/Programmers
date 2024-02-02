package com.example.programmers.lv0;

import java.util.Arrays;

public class Solution_day41 {
    //문자열 my_str과 n이 매개변수로 주어질 때,
    //my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요
    public String[] solution(String my_str, int n) {
        double arrLength = Math.ceil((double) my_str.length() / n);
        String[] answer = new String[(int) arrLength];

        for (int i = 0; i < arrLength; i++){
            if (my_str.length() >= n){
                answer[i] = my_str.substring(0, n);
                my_str = my_str.substring(n, my_str.length());
            }else {
                answer[i] = my_str.substring(0, my_str.length());
            }
        }
        return answer;
    }
}
