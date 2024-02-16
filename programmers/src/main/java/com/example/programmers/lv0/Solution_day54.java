package com.example.programmers.lv0;

public class Solution_day54 {
    //선분 3개가 평행하게 놓여 있습니다.
    //세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때,
    //두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
    public int solution(int[][] lines) {
        int answer = 0;
        int[] num = new int[200];
        for (int[] i : lines){
            for (int j = (i[0] + 100); j < (i[1] + 100); j++){
                num[j]++;
            }
        }
        for (int val : num){
            if (val > 1) answer++;
        }
        return answer;
    }
}
