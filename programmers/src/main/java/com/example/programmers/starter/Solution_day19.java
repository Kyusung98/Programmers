package com.example.programmers.starter;

import java.util.Arrays;

public class Solution_day19 {
    //삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
    //세 변으로 삼각형을 만들 수 있다면 1,
    //만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if (sides[0] + sides[1] > sides[2]){
            answer = 1;
        }
        else answer = 2;
        return answer;
    }
}
