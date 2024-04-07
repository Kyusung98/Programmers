package com.example.programmers.basic.day13;

import java.util.ArrayList;
import java.util.List;

public class Solution61 {
    //정수 리스트 num_list와 정수 n이 주어질 때,
    //n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = n; i < num_list.length; i++){
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}
