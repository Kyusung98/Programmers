package com.example.programmers.starter;

public class Solution_day27 {
    //정수 n이 매개변수로 주어질 때,
    //n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if (n % i == 0){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        int array = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                answer[array] = i;
                array++;
            }
        }
        return answer;
    }
}
