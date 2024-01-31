package com.example.programmers.lv0;

import java.util.Arrays;

public class Solution_day39 {
    //영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
    //my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
    public String solution(String my_string) {
        char[] s = my_string.toLowerCase().toCharArray();
        Arrays.sort(s);
        return new String(s);
    }
}
