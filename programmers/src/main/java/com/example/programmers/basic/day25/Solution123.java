package com.example.programmers.basic.day25;

public class Solution123 {
    //이차원 정수 배열 arr이 매개변수로 주어집니다. arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고,
    //열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
    public int[][] solution(int[][] arr) {
        int x = arr.length;
        int y = arr[0].length;

        if (x > y){
            int tmp[][] = new int[x][x];
            for (int i = 0; i < x; i++){
                for (int j = 0; j < y; j++){
                    tmp[i][j] = arr[i][j];
                }
                tmp[i][y] = 0;
            }
            return tmp;
        } else if (y > x) {
            int tmp[][] = new int[y][y];
            for (int i = 0; i < y; i++){
                for (int j = 0; j < x; j++){
                    tmp[j][i] = arr[j][i];
                }
                tmp[x][i] = 0;
            }
            return tmp;
        }
        return arr;
    }
}
