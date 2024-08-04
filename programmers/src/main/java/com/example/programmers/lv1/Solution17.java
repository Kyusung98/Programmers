package com.example.programmers.lv1;

public class Solution17 {
    //0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
    //numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
    public int solution(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= 9; i++){
            int b = 0;
            for (int j = 0; j < numbers.length; j++){
                if (i == numbers[j]) {
                    b++;
                    break;
                }
            }
            if (b == 0){
                sum += i;
            }
        }
        return sum;
    }
}
