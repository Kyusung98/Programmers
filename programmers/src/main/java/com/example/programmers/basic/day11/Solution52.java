package com.example.programmers.basic.day11;

public class Solution52 {
    //정수 n과 k가 주어졌을 때,
    //1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int cnt = 0;
        for (int i = k; i <= n; i++){
            if (i%k == 0){
                answer[cnt] = i;
                cnt++;
            }
        }
        return answer;
    }
}
