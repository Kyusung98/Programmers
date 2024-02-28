package com.example.programmers.starter;

public class Solution_day20 {
    //정수 배열 array와 정수 n이 매개변수로 주어질 때,
    //array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;

        for (int i = 0; i < array.length; i++){
            int abs = Math.abs(n - array[i]);
            if (abs < min) {
                min = abs;
                answer = array[i];
            } else if (abs == min && array[i] < answer) {
                answer = array[i];
            }
        }
        return answer;
    }
}
