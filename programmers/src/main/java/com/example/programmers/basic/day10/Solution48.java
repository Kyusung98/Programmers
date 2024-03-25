package com.example.programmers.basic.day10;

public class Solution48 {
    //문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
    //my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s, e + 1);

        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();

        my_string = my_string.replaceAll(answer, reverse);
        return my_string;
    }
}
