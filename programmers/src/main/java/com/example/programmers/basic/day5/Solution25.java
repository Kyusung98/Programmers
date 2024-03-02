package com.example.programmers.basic.day5;

public class Solution25 {
    //정수가 담긴 리스트 num_list가 주어집니다.
    //num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
    public int solution(int[] num_list) {
        String s1 = "";
        String s2 = "";
        for (int i : num_list){
            if (i % 2 == 0){
                s2 += i;
            }else {
                s1 += i;
            }
        }
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }
}
