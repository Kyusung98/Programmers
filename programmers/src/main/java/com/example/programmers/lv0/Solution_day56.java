package com.example.programmers.lv0;

import java.util.Arrays;

public class Solution_day56 {
    //정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
    //이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
    //정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        for (int i = 0; i < numlist.length; i++){
            for (int j = 0; j < numlist.length; j++){
                if (Math.abs(n - numlist[i]) <= Math.abs(n - numlist[j])){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        return numlist;
    }
}
// 1,2,3,4,5,6 n = 4
// 4 - 1 = 3
// 4 - 2 = 2
// 4 - 3 = 1
// 4 - 5 = -1
// 4 - 6 = -2
// answer[0] = 1
// n - 2 = 2 < n - 1 = 3
// list[1] -> answer[0] , answer[0] > answer[1]