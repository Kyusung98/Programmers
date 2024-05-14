package com.example.programmers.basic.day18;

public class Solution88 {
    //문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수,
    //op는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
    public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        switch (str[1]){
            case "+": answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
                break;
            case "-": answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
                break;
            case "*": answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
                break;
        }
        return answer;
    }
}
