package com.example.programmers.basic.day20;

import java.util.Arrays;

public class Solution98 {
    //문자열 배열 strArr이 주어집니다.
    //strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
    public int solution(String[] strArr) {
            int[] count = new int[100000];
            for(int i = 0 ; i < strArr.length; i++) {
                count[strArr[i].length()]++;
            }
            return Arrays.stream(count).max().getAsInt();
    }
}
