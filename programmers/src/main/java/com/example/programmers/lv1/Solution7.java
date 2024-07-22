package com.example.programmers.lv1;

public class Solution7 {
    //자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
    //예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
    public int[] solution(long n) {
        String[] str = String.valueOf(n).split("");
        int[] answer = new int[str.length];
        for (int i = 0; i < str.length; i++){
            answer[i] = Integer.parseInt(str[str.length - (i + 1)]);
        }

        return answer;
    }
}
