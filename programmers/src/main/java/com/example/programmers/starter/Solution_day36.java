package com.example.programmers.starter;

public class Solution_day36 {
    //문자열 str1, str2가 매개변수로 주어집니다.
    //str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
    public int solution(String str1, String str2) {
        if (str1.contains(str2)){
            return 1;
        }
        return 2;
    }
}
