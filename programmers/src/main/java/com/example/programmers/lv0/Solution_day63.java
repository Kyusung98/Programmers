package com.example.programmers.lv0;

public class Solution_day63 {
    //머쓱이는 큰 종이를 1 x 1 크기의 네모로 자르려고 합니다.
    // 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
    //정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해보세요.
    public int solution(int M, int N) {
        int answer = (M-1) + (N-1) * M;
        return answer;
    }
}
//가로 2 세로 5 = 9
//가로 3 세로 5 = 12