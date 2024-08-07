package com.example.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {
    //array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    //divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int ar : arr){
            if (ar % divisor == 0){
                list.add(ar);
            }
        }
        if (list.size() == 0){
            return new int[]{-1};
        }
        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
