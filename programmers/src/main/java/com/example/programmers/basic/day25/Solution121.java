package com.example.programmers.basic.day25;

public class Solution121 {
    //양의 정수 n이 매개변수로 주어집니다.
    //n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0;
        int y = 0;
        int dir = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        while (num <= n * n){
            answer[y][x] = num++;
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (ny < 0 || nx < 0 || ny >= n || nx >= n || answer[ny][nx] != 0) {
                dir = (dir + 1) % 4;
                ny = y + dy[dir];
                nx = x + dx[dir];
            }
            y = ny;
            x = nx;
        }
        return answer;
    }
}
