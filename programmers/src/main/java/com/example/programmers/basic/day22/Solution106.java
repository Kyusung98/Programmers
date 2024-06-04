package com.example.programmers.basic.day22;

import java.util.Arrays;

public class Solution106 {
    //정수로 이루어진 문자열 n_str이 주어질 때,
    //n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution(String n_str) {
        String answer = "";
        String[] str = n_str.split("");
        int cnt = 0;
        for (String s : str){
            if (s.equals("0")){
                 cnt++;
            }
            else {
                break;
            }
        }
        for (int i = cnt; i < str.length; i++){
            answer += str[i];
        }

        return answer;
    }
}
