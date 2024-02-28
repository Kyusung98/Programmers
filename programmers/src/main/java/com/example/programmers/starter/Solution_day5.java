package com.example.programmers.starter;

public class Solution_day5 {
    //정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
    //num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution1(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
        for(int i = length-1; i >= 0; i--){
            answer[length-1-i] = num_list[i];
        }
        return answer;
    }

}
