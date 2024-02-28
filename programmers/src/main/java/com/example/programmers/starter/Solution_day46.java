package com.example.programmers.starter;

import java.util.Arrays;

public class Solution_day46 {
    //정수 배열 numbers가 매개변수로 주어집니다.
    //numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length-1] * numbers[numbers.length-2];

        return num1 > num2 ? num1 : num2;
    }
}
