package com.example.programmers.basic.day7;

import java.util.ArrayList;

public class Solution32 {
    //정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    //만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++){
            if (String.valueOf(i).matches("[05]+")) list.add(i);
        }
        if (list.isEmpty()) return new int[]{-1};

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
