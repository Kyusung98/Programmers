package com.example.programmers.lv0;

public class Solution_day32 {
    //정수 num과 k가 매개변수로 주어질 때,
    //num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
    public int solution(int num, int k) {
        int answer = 1;

        String[] tmp = String.valueOf(num).split("");
        for (int i = 0; i < tmp.length; i++){
            if (Integer.parseInt(tmp[i]) != k){
                answer++;
            }
            if (Integer.parseInt(tmp[i]) == k){
                return answer;
            }
        }
        return -1;
    }
}
