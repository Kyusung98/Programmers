package com.example.programmers.basic.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution59 {
    //정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
    //단, arr에 2가 없는 경우 [-1]을 return 합니다.
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 2) list.add(i);
        }
        if (list.size() == 0) return new int[]{-1};
        int start = list.get(0);
        int end = list.get(list.size() - 1);
        int[] answer = Arrays.copyOfRange(arr, start, end + 1);
        return answer;
    }
}
