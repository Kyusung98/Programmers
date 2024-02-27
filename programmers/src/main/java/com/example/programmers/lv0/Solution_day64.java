package com.example.programmers.lv0;

public class Solution_day64 {
    //연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다.
    //연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
    public int[] solution1(int num, int total) {
        int[] answer = new int[num];
        int start = total / num - (num -1) /2;
        for (int i = 0; i < num; i++){
            answer[i] = start;
            start++;
        }
        return answer;
    }

    //등차수열 혹은 등비수열 common이 매개변수로 주어질 때,
    //마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
    public int solution(int[] common) {
        if (common[1] - common[0] == common[2] - common[1]) return common[common.length-1] + (common[1] - common[0]);
        return common[common.length-1] * (common[1] / common[0]);
    }
}

