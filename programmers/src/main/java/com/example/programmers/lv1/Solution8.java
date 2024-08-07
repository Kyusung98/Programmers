package com.example.programmers.lv1;

import java.util.Arrays;

public class Solution8 {
    //함수 solution은 정수 n을 매개변수로 입력받습니다.
    //n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
    public long solution(long n) {
        String answer = "";
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str);
        for (int i = 0; i < str.length; i++){
            answer += str[str.length - (i + 1)];
        }
        return Long.parseLong(answer);
    }
}
