package com.example.programmers.basic.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution96 {
    //정수 배열 arr이 매개변수로 주어집니다. arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
    //arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr){
            list.add(i);
        }
        for (int i = 0; i < 10; i++){
            if (arr.length == Math.pow(2, i)){
                return arr;
            }
            if (arr.length < Math.pow(2, i)){
                for (int j = list.size(); j < Math.pow(2, i); j++){
                    list.add(0);
                }
                return list.stream().mapToInt(Integer::intValue).toArray();
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
